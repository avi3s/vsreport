package com.vs.vsreport.model;


import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class InputModel {

	@NotBlank(message="Please Enter Proper Start Date")
	@JsonProperty("startDate")
	private String startDate;
	
	@NotBlank(message="Please Enter Proper End Date")
	@JsonProperty("endDate")
	private String endDate;
}
