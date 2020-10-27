package com.vs.vsreport.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.google.gson.Gson;
import com.vs.vsreport.config.MethodLog;
import com.vs.vsreport.dao.AuthenticationDAO;
import com.vs.vsreport.dao.AuthorizationDAO;
import com.vs.vsreport.dao.RoutingDAO;
import com.vs.vsreport.entity.RoutingEntity;
import com.vs.vsreport.model.InputModel;
import com.vs.vsreport.model.RuleModel;
import com.vs.vsreport.service.VSReportService;

@Service
@Transactional
@EnableAsync
public class VSReportServiceImpl implements VSReportService {

	@Autowired
	private RoutingDAO routingDAO;
	
	@Autowired
	private AuthenticationDAO authenticationDAO;
	
	@Autowired
	private AuthorizationDAO authorizationDAO;
	
	private List<RoutingEntity> fetchAllFromRoutingTable(InputModel input) {
		
		List<RoutingEntity> routingEntities = null;
		try {
			input.setEndDate(input.getEndDate() + " 11.59.59.000000000 PM");
			input.setStartDate(input.getStartDate() + " 12.00.00.000000000 AM");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy HH.mm.ss.SSS", Locale.ENGLISH);
			Date endDate = formatter.parse(input.getEndDate());
			Date startDate = formatter.parse(input.getStartDate());
			routingEntities = routingDAO.findAllByLastUpdatedGTSLessThanEqualAndLastUpdatedGTSGreaterThanEqual(endDate, startDate);
			System.out.println("routingEntities ==>> " + routingEntities);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return routingEntities;
	}

	@Override
	@Async
	@MethodLog
	public List<String> transactionCount(InputModel input) {

		List<RoutingEntity> routingEntities = fetchAllFromRoutingTable(input);
		if(!CollectionUtils.isEmpty(routingEntities)) {
			
			for(RoutingEntity routingEntity: routingEntities) {
				RuleModel ruleModel = new Gson().fromJson(routingEntity.getRTG_DATA_OBJ(), RuleModel.class);
				System.out.println("ruleModel ==>> " +ruleModel);
			}
//			List<RoutingEntity> worldPay = routingEntities.parallelStream().filter(re -> re.getRTG_DATA_OBJ().contains("WORLDPAY")).collect(Collectors.toList());
//			List<RoutingEntity> realex = routingEntities.parallelStream().filter(re -> re.getRTG_DATA_OBJ().contains("REALEX")).collect(Collectors.toList());
//			System.out.println("worldPay ==>> " + worldPay.size());
//			System.out.println("realex ==>> " + realex.size());
		}
		return null;
	}
	
	@Override
	@Async
	public List<String> transactionTypeCount(InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Async
	public List<String> cardTypeCount(InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Async
	public List<String> challengeCount(InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Async
	public List<String> frictionlessCount(InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Async
	public List<String> authenticationStatusOfSuccessCount(InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Async
	public List<String> failedAuthenticationCount(InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}
}
