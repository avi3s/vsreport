package com.vs.vsreport.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class MailModel {

	@NotNull(message="{email.null.message}")
	@Email(message="{email.format.message}")
	private String emailId;
	
	@NotNull(message="{email.body.null.message}")
	private String messageBody;
	
	@NotNull(message="{email.subject.null.message}")
	private String subject;
	
	private String filePath;
	private String fileName;
}
