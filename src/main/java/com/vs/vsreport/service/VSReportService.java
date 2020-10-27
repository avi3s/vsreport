package com.vs.vsreport.service;

import java.util.List;

import com.vs.vsreport.model.InputModel;

public interface VSReportService {

	List<String> transactionCount(InputModel input);

	List<String> transactionTypeCount(InputModel input);

	List<String> cardTypeCount(InputModel input);

	List<String> challengeCount(InputModel input);

	List<String> frictionlessCount(InputModel input);

	List<String> authenticationStatusOfSuccessCount(InputModel input);

	List<String> failedAuthenticationCount(InputModel input);
}
