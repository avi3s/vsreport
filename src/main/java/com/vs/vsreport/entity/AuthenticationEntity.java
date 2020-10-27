package com.vs.vsreport.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "pmt_crd_athn")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class AuthenticationEntity {

	private static final long serialVersionUID = 1074170048193121955L;
	
	@Id
	@Column(name = "PMT_RFRN_ID", columnDefinition = "char", length = 60)
	@JsonProperty("paymentReferenceId")
	private String paymentReferenceId;
	
	@Column(name = "ALT_PMT_RFRN_ID", columnDefinition = "char", length = 60)
	@JsonProperty("alternatePaymentReferenceId")
	private String alternatePaymentReferenceId;
	
	@Lob
	@Column(name = "RTG_DATA_OBJ")
	@JsonProperty("rtgDATAOBJ")
	private String rtgDATAOBJ;
	
	@Column(name = "LST_UPDT_GTS")
	@JsonProperty("lastUpdatedGTS")
	private Timestamp lastUpdatedGTS;
}
