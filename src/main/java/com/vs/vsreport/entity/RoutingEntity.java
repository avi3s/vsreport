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
@Table(name = "dynm_trns_rter")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class RoutingEntity {

	//	PMT_RFRN_ID	VARCHAR2(60 BYTE)
	@Id
	@Column(name = "PMT_RFRN_ID", columnDefinition = "char", length = 60)
	@JsonProperty("PMT_RFRN_ID")
	private String PMT_RFRN_ID;
	
//	ALT_PMT_RFRN_ID	VARCHAR2(60 BYTE)
	@Column(name = "ALT_PMT_RFRN_ID", columnDefinition = "char", length = 60)
	@JsonProperty("ALT_PMT_RFRN_ID")
	private String ALT_PMT_RFRN_ID;
	
//	RTG_DATA_OBJ	CLOB
	@Lob
	@Column(name = "RTG_DATA_OBJ")
	@JsonProperty("RTG_DATA_OBJ")
	private String RTG_DATA_OBJ;
	
//	LST_UPDT_GTS	TIMESTAMP(6)
	@Column(name = "LST_UPDT_GTS")
	@JsonProperty("LST_UPDT_GTS")
	private Timestamp LST_UPDT_GTS;
}
