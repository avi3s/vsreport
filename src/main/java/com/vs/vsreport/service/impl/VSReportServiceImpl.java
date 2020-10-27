package com.vs.vsreport.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.vs.vsreport.dao.RoutingDAO;
import com.vs.vsreport.entity.RoutingEntity;
import com.vs.vsreport.model.InputModel;
import com.vs.vsreport.service.VSReportService;

@Service
@Transactional
public class VSReportServiceImpl implements VSReportService {

	@Autowired
	private RoutingDAO routingDAO;
	
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
	public List<String> transactionCount(InputModel input) {

		List<RoutingEntity> routingEntities = fetchAllFromRoutingTable(input);
		if(!CollectionUtils.isEmpty(routingEntities)) {
			List<RoutingEntity> worldPay = routingEntities.parallelStream().filter(re -> re.getRtgDATAOBJ().contains("WORLDPAY")).collect(Collectors.toList());
			List<RoutingEntity> realex = routingEntities.parallelStream().filter(re -> re.getRtgDATAOBJ().contains("REALEX")).collect(Collectors.toList());
		}
		return null;
	}

	@Override
	public List<String> transactionTypeCount(@Valid InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> cardTypeCount(@Valid InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> challengeCount(@Valid InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> frictionlessCount(@Valid InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> authenticationStatusOfSuccessCount(@Valid InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> failedAuthenticationCount(@Valid InputModel input) {
		// TODO Auto-generated method stub
		return null;
	}
}
