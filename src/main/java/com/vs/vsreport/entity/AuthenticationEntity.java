package com.vs.vsreport.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
//	PMT_RFRN_ID	VARCHAR2(60 BYTE)
	@Id
	@Column(name = "PMT_RFRN_ID", columnDefinition = "char", length = 60)
	@JsonProperty("paymentReferenceId")
	private String paymentReferenceId;
	
//	UNVSL_CARDHLDR_ATHN_ID	VARCHAR2(38 BYTE)
	@Column(name = "UNVSL_CARDHLDR_ATHN_ID", columnDefinition = "char", length = 38)
	@JsonProperty("UNVSL_CARDHLDR_ATHN_ID")
	private String UNVSL_CARDHLDR_ATHN_ID;
	
//	ELCR_CMRC_IND	VARCHAR2(3 BYTE)
	@Column(name = "ELCR_CMRC_IND", columnDefinition = "char", length = 3)
	@JsonProperty("ELCR_CMRC_IND")
	private String ELCR_CMRC_IND;
	
//	CARDHLDR_ATHN_VRFN_ID	VARCHAR2(60 BYTE)
	@Column(name = "CARDHLDR_ATHN_VRFN_ID", columnDefinition = "char", length = 60)
	@JsonProperty("CARDHLDR_ATHN_VRFN_ID")
	private String CARDHLDR_ATHN_VRFN_ID;
	
//	CARDHLDR_ATHN_VRFN_ALGTM_NM	VARCHAR2(60 BYTE)
	@Column(name = "CARDHLDR_ATHN_VRFN_ALGTM_NM", columnDefinition = "char", length = 60)
	@JsonProperty("CARDHLDR_ATHN_VRFN_ALGTM_NM")
	private String CARDHLDR_ATHN_VRFN_ALGTM_NM;
	
//	ATHN_TRNS_ID	VARCHAR2(60 BYTE)
	@Column(name = "ATHN_TRNS_ID", columnDefinition = "char", length = 60)
	@JsonProperty("ATHN_TRNS_ID")
	private String ATHN_TRNS_ID;
	
//	SRVR_TRNS_ID	VARCHAR2(40 BYTE)
	@Column(name = "SRVR_TRNS_ID", columnDefinition = "char", length = 40)
	@JsonProperty("SRVR_TRNS_ID")
	private String SRVR_TRNS_ID;
	
//	DIRY_SRVR_TRNS_ID	VARCHAR2(40 BYTE)
	@Column(name = "DIRY_SRVR_TRNS_ID", columnDefinition = "char", length = 40)
	@JsonProperty("DIRY_SRVR_TRNS_ID")
	private String DIRY_SRVR_TRNS_ID;
	
//	TKZD_PAN_ID	VARCHAR2(25 BYTE)
	@Column(name = "TKZD_PAN_ID", columnDefinition = "char", length = 25)
	@JsonProperty("TKZD_PAN_ID")
	private String TKZD_PAN_ID;
	
//	ATHN_AMT	NUMBER(38,2)
	@Column(name = "ATHN_AMT", precision = 38, scale = 2)
	@JsonProperty("ATHN_AMT")
	private BigDecimal ATHN_AMT;
	
//	CRTN_GTS	TIMESTAMP(6)
	@Column(name = "CRTN_GTS")
	@JsonProperty("CRTN_GTS")
	private Timestamp CRTN_GTS;
	
//	CRTN_GDT	DATE
	@Column(name = "CRTN_GDT")
	@Temporal(TemporalType.DATE)
	@JsonProperty("CRTN_GDT")
	private Date CRTN_GDT;
	
//	SECR_VER_NB	VARCHAR2(10 BYTE)
	@Column(name = "SECR_VER_NB", columnDefinition = "char", length = 10)
	@JsonProperty("SECR_VER_NB")
	private String SECR_VER_NB;
	
//	REQ_CHNL_ID	VARCHAR2(10 BYTE)
	@Column(name = "REQ_CHNL_ID", columnDefinition = "char", length = 10)
	@JsonProperty("REQ_CHNL_ID")
	private String REQ_CHNL_ID;
	
//	CARD_ENR_ID	VARCHAR2(3 BYTE)
	@Column(name = "CARD_ENR_ID", columnDefinition = "char", length = 3)
	@JsonProperty("CARD_ENR_ID")
	private String CARD_ENR_ID;
	
//	PARES_STT_CD	VARCHAR2(3 BYTE)
	@Column(name = "PARES_STT_CD", columnDefinition = "char", length = 3)
	@JsonProperty("PARES_STT_CD")
	private String PARES_STT_CD;
	
//	PMT_HS_SRVR_NM	VARCHAR2(50 BYTE)
	@Column(name = "PMT_HS_SRVR_NM", columnDefinition = "char", length = 50)
	@JsonProperty("PMT_HS_SRVR_NM")
	private String PMT_HS_SRVR_NM;
	
//	PRNT_PMT_RFRN_ID	VARCHAR2(60 BYTE)
	@Column(name = "PRNT_PMT_RFRN_ID", columnDefinition = "char", length = 60)
	@JsonProperty("PRNT_PMT_RFRN_ID")
	private String PRNT_PMT_RFRN_ID;
	
//	PMT_CARD_CHLG_CD	VARCHAR2(10 BYTE)
	@Column(name = "PMT_CARD_CHLG_CD", columnDefinition = "char", length = 10)
	@JsonProperty("PMT_CARD_CHLG_CD")
	private String PMT_CARD_CHLG_CD;
	
//	PMT_CARD_SGNT_STT_CD	VARCHAR2(3 BYTE)
	@Column(name = "PMT_CARD_SGNT_STT_CD", columnDefinition = "char", length = 3)
	@JsonProperty("PMT_CARD_SGNT_STT_CD")
	private String PMT_CARD_SGNT_STT_CD;
	
//	TEALEAF_SESS_ID	VARCHAR2(32 BYTE)
	@Column(name = "TEALEAF_SESS_ID", columnDefinition = "char", length = 32)
	@JsonProperty("TEALEAF_SESS_ID")
	private String TEALEAF_SESS_ID;
	
//	PREV_ELCR_CMRC_IND	VARCHAR2(3 BYTE)
	@Column(name = "PREV_ELCR_CMRC_IND", columnDefinition = "char", length = 3)
	@JsonProperty("PREV_ELCR_CMRC_IND")
	private String PREV_ELCR_CMRC_IND;
	
//	CRTN_USR_ID	VARCHAR2(13 BYTE)
	@Column(name = "CRTN_USR_ID", columnDefinition = "char", length = 13)
	@JsonProperty("CRTN_USR_ID")
	private String CRTN_USR_ID;
	
//	LST_UPDT_USR_ID	VARCHAR2(13 BYTE)
	@Column(name = "LST_UPDT_USR_ID", columnDefinition = "char", length = 13)
	@JsonProperty("LST_UPDT_USR_ID")
	private String LST_UPDT_USR_ID;
	
//	LST_UPDT_GTS	TIMESTAMP(6)
	@Column(name = "LST_UPDT_GTS")
	@JsonProperty("LST_UPDT_GTS")
	private Timestamp LST_UPDT_GTS;
	
//	PURCH_PTH_TXT	VARCHAR2(50 BYTE)
	@Column(name = "PURCH_PTH_TXT", columnDefinition = "char", length = 50)
	@JsonProperty("PURCH_PTH_TXT")
	private String PURCH_PTH_TXT;
	
//	APCN_ID	VARCHAR2(25 BYTE)
	@Column(name = "APCN_ID", columnDefinition = "char", length = 25)
	@JsonProperty("APCN_ID")
	private String APCN_ID;
	
//	VNDR_ORD_ID	VARCHAR2(60 BYTE)
	@Column(name = "VNDR_ORD_ID", columnDefinition = "char", length = 60)
	@JsonProperty("VNDR_ORD_ID")
	private String VNDR_ORD_ID;
}
