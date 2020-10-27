package com.vs.vsreport.service;

import java.util.List;

import javax.validation.Valid;

import com.vs.vsreport.model.InputModel;

public interface VSReportService {

	List<String> transactionCount(InputModel input);

	List<String> transactionTypeCount(@Valid InputModel input);

	List<String> cardTypeCount(@Valid InputModel input);

	List<String> challengeCount(@Valid InputModel input);

	List<String> frictionlessCount(@Valid InputModel input);

	List<String> authenticationStatusOfSuccessCount(@Valid InputModel input);

	List<String> failedAuthenticationCount(@Valid InputModel input);
}
