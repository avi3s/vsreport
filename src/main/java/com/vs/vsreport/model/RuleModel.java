package com.vs.vsreport.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RuleModel {
	
    private String ruleFired;
    private String isRuleMatched;
    private String sourceFields;
    private String ruleFields;
}
