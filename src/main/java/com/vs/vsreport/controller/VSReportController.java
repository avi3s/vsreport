package com.vs.vsreport.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vs.vsreport.config.MethodLog;
import com.vs.vsreport.model.InputModel;
import com.vs.vsreport.service.VSReportService;

@Controller
public class VSReportController {

	@Autowired
	private VSReportService vsReportService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date - dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showSearchPage(ModelMap model) {
		model.addAttribute("input", new InputModel());
		return "input";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@MethodLog
	public String fetchReports(ModelMap model, @Valid InputModel input, BindingResult result) {

		if (result.hasErrors()) {
			return "redirect:/";
		}

		List<String> transactionCount = vsReportService.transactionCount(input);
		List<String> transactionTypeCount = vsReportService.transactionTypeCount(input);
		List<String> cardTypeCount = vsReportService.cardTypeCount(input);
		List<String> challengeCount = vsReportService.challengeCount(input);
		List<String> frictionlessCount = vsReportService.frictionlessCount(input);
		List<String> authenticationStatusOfSuccessCount = vsReportService.authenticationStatusOfSuccessCount(input);
		List<String> failedAuthenticationCount = vsReportService.failedAuthenticationCount(input);
		
		model.put("transactionCount", transactionCount);
		model.put("transactionTypeCount", transactionTypeCount);
		model.put("cardTypeCount", cardTypeCount);
		model.put("challengeCount", challengeCount);
		model.put("frictionlessCount", frictionlessCount);
		model.put("authenticationStatusOfSuccessCount", authenticationStatusOfSuccessCount);
		model.put("failedAuthenticationCount", failedAuthenticationCount);
		
		return "output";
	}
}
