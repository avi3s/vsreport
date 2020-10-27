package com.vs.vsreport.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PMT_AUTH")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class AuthorizationEntity {

//	PMT_RFRN_ID	VARCHAR2(60 BYTE)
	@Id
	@Column(name = "PMT_RFRN_ID", columnDefinition = "char", length = 60)
	@JsonProperty("PMT_RFRN_ID")
	private String PMT_RFRN_ID;
	
//	AUTH_APVL_CD	VARCHAR2(8 BYTE)
	@Column(name = "AUTH_APVL_CD", columnDefinition = "char", length = 8)
	@JsonProperty("AUTH_APVL_CD")
	private String AUTH_APVL_CD;
	
//	AUTH_CHRCTRS_IND	VARCHAR2(3 BYTE)
	@Column(name = "AUTH_CHRCTRS_IND", columnDefinition = "char", length = 3)
	@JsonProperty("AUTH_CHRCTRS_IND")
	private String AUTH_CHRCTRS_IND;
	
//	AUTH_VLDTN_CD	VARCHAR2(6 BYTE)
	@Column(name = "AUTH_VLDTN_CD", columnDefinition = "char", length = 6)
	@JsonProperty("AUTH_VLDTN_CD")
	private String AUTH_VLDTN_CD;
	
//	AUTH_RSPN_CD	VARCHAR2(6 BYTE)
	@Column(name = "AUTH_RSPN_CD", columnDefinition = "char", length = 6)
	@JsonProperty("AUTH_RSPN_CD")
	private String AUTH_RSPN_CD;
	
//	AUTH_SRC_NM	VARCHAR2(10 BYTE)
	@Column(name = "AUTH_SRC_NM", columnDefinition = "char", length = 10)
	@JsonProperty("AUTH_SRC_NM")
	private String AUTH_SRC_NM;
	
//	AUTH_SRC_CD	VARCHAR2(3 BYTE)
	@Column(name = "AUTH_SRC_CD", columnDefinition = "char", length = 3)
	@JsonProperty("AUTH_SRC_CD")
	private String AUTH_SRC_CD;
	
//	POS_ENTY_MODE_CD	VARCHAR2(3 BYTE)
	@Column(name = "POS_ENTY_MODE_CD", columnDefinition = "char", length = 3)
	@JsonProperty("POS_ENTY_MODE_CD")
	private String POS_ENTY_MODE_CD;
	
//	ADR_VRFN_RSPN_CD	VARCHAR2(3 BYTE)
	@Column(name = "ADR_VRFN_RSPN_CD", columnDefinition = "char", length = 3)
	@JsonProperty("ADR_VRFN_RSPN_CD")
	private String ADR_VRFN_RSPN_CD;
	
//	BNKNET_DT	VARCHAR2(6 BYTE)
	@Column(name = "BNKNET_DT", columnDefinition = "char", length = 6)
	@JsonProperty("BNKNET_DT")
	private String BNKNET_DT;
	
//	BNKNET_RFRN_NB	VARCHAR2(18 BYTE)
	@Column(name = "BNKNET_RFRN_NB", columnDefinition = "char", length = 18)
	@JsonProperty("BNKNET_RFRN_NB")
	private String BNKNET_RFRN_NB;
	
//	CARD_LVL_RSLT_TXT	VARCHAR2(4 BYTE)
	@Column(name = "CARD_LVL_RSLT_TXT", columnDefinition = "char", length = 4)
	@JsonProperty("CARD_LVL_RSLT_TXT")
	private String CARD_LVL_RSLT_TXT;
	
//	TRNS_RSPN_RFRN_NB	VARCHAR2(20 BYTE)
	@Column(name = "TRNS_RSPN_RFRN_NB", columnDefinition = "char", length = 20)
	@JsonProperty("TRNS_RSPN_RFRN_NB")
	private String TRNS_RSPN_RFRN_NB;
	
//	POS_DATA_CD	VARCHAR2(25 BYTE)
	@Column(name = "POS_DATA_CD", columnDefinition = "char", length = 25)
	@JsonProperty("POS_DATA_CD")
	private String POS_DATA_CD;
	
//	CARD_HLDR_METH_CD	VARCHAR2(3 BYTE)
	@Column(name = "CARD_HLDR_METH_CD", columnDefinition = "char", length = 3)
	@JsonProperty("CARD_HLDR_METH_CD")
	private String CARD_HLDR_METH_CD;
	
//	ACCT_ID	VARCHAR2(30 BYTE)
	@Column(name = "ACCT_ID", columnDefinition = "char", length = 30)
	@JsonProperty("ACCT_ID")
	private String ACCT_ID;
	
//	ACCT_STT_CD	VARCHAR2(3 BYTE)
	@Column(name = "ACCT_STT_CD", columnDefinition = "char", length = 3)
	@JsonProperty("ACCT_STT_CD")
	private String ACCT_STT_CD;
	
//	TOKN_ASRC_LVL_CD	VARCHAR2(3 BYTE)
	@Column(name = "TOKN_ASRC_LVL_CD", columnDefinition = "char", length = 3)
	@JsonProperty("TOKN_ASRC_LVL_CD")
	private String TOKN_ASRC_LVL_CD;
	
//	TOKN_RQSR_ID	VARCHAR2(14 BYTE)
	@Column(name = "TOKN_RQSR_ID", columnDefinition = "char", length = 14)
	@JsonProperty("TOKN_RQSR_ID")
	private String TOKN_RQSR_ID;
	
//	SPND_QFYD_CD	VARCHAR2(3 BYTE)
	@Column(name = "SPND_QFYD_CD", columnDefinition = "char", length = 3)
	@JsonProperty("SPND_QFYD_CD")
	private String SPND_QFYD_CD;
	
//	SCTY_PTCL_IND	VARCHAR2(3 BYTE)
	@Column(name = "SCTY_PTCL_IND", columnDefinition = "char", length = 3)
	@JsonProperty("SCTY_PTCL_IND")
	private String SCTY_PTCL_IND;
	
//	TRNS_INTG_CLS_CD	VARCHAR2(3 BYTE)
	@Column(name = "TRNS_INTG_CLS_CD", columnDefinition = "char", length = 3)
	@JsonProperty("TRNS_INTG_CLS_CD")
	private String TRNS_INTG_CLS_CD;
	
//	PMT_ACCT_RFRN_NB	VARCHAR2(40 BYTE)
	@Column(name = "PMT_ACCT_RFRN_NB", columnDefinition = "char", length = 40)
	@JsonProperty("PMT_ACCT_RFRN_NB")
	private String PMT_ACCT_RFRN_NB;
	
//	MKT_SPFC_DATA_CD	VARCHAR2(3 BYTE)
	@Column(name = "MKT_SPFC_DATA_CD", columnDefinition = "char", length = 3)
	@JsonProperty("MKT_SPFC_DATA_CD")
	private String MKT_SPFC_DATA_CD;
	
//	SYS_TRC_AUDT_NB	VARCHAR2(10 BYTE)
	@Column(name = "SYS_TRC_AUDT_NB", columnDefinition = "char", length = 10)
	@JsonProperty("SYS_TRC_AUDT_NB")
	private String SYS_TRC_AUDT_NB;
	
//	TRNS_DATA_CNDTN_CD	VARCHAR2(6 BYTE)
	@Column(name = "TRNS_DATA_CNDTN_CD", columnDefinition = "char", length = 6)
	@JsonProperty("TRNS_DATA_CNDTN_CD")
	private String TRNS_DATA_CNDTN_CD;
	
//	AUTH_PRSG_CD	VARCHAR2(8 BYTE)
	@Column(name = "AUTH_PRSG_CD", columnDefinition = "char", length = 8)
	@JsonProperty("AUTH_PRSG_CD")
	private String AUTH_PRSG_CD;
	
//	TRNS_CURR_CD	VARCHAR2(3 BYTE)
	@Column(name = "TRNS_CURR_CD", columnDefinition = "char", length = 3)
	@JsonProperty("TRNS_CURR_CD")
	private String TRNS_CURR_CD;
	
//	TRNS_CTRY_CD	VARCHAR2(3 BYTE)
	@Column(name = "TRNS_CTRY_CD", columnDefinition = "char", length = 3)
	@JsonProperty("TRNS_CTRY_CD")
	private String TRNS_CTRY_CD;
	
//	AUTH_TRNS_AMT	NUMBER(38,8)
	@Column(name = "AUTH_TRNS_AMT", precision = 38, scale = 8)
	@JsonProperty("AUTH_TRNS_AMT")
	private BigDecimal AUTH_TRNS_AMT;
	
//	TKZD_PAN_ID	VARCHAR2(25 BYTE)
	@Column(name = "TKZD_PAN_ID", columnDefinition = "char", length = 25)
	@JsonProperty("TKZD_PAN_ID")
	private String TKZD_PAN_ID;
	
//	PMT_AUTH_STT_CD	VARCHAR2(25 BYTE)
	@Column(name = "PMT_AUTH_STT_CD", columnDefinition = "char", length = 25)
	@JsonProperty("PMT_AUTH_STT_CD")
	private String PMT_AUTH_STT_CD;
	
//	MHNT_ID	VARCHAR2(50 BYTE)
	@Column(name = "MHNT_ID", columnDefinition = "char", length = 50)
	@JsonProperty("MHNT_ID")
	private String MHNT_ID;
	
//	TERNL_ID	VARCHAR2(12 BYTE)
	@Column(name = "TERNL_ID", columnDefinition = "char", length = 12)
	@JsonProperty("TERNL_ID")
	private String TERNL_ID;
	
//	RTVL_RFRN_NB	VARCHAR2(14 BYTE)
	@Column(name = "RTVL_RFRN_NB", columnDefinition = "char", length = 14)
	@JsonProperty("RTVL_RFRN_NB")
	private String RTVL_RFRN_NB;
	
//	STRD_CDNL_IND	VARCHAR2(3 BYTE)
	@Column(name = "STRD_CDNL_IND", columnDefinition = "char", length = 3)
	@JsonProperty("STRD_CDNL_IND")
	private String STRD_CDNL_IND;
	
//	UNATND_ACPN_TERNL_IND	VARCHAR2(3 BYTE)
	@Column(name = "UNATND_ACPN_TERNL_IND", columnDefinition = "char", length = 3)
	@JsonProperty("UNATND_ACPN_TERNL_IND")
	private String UNATND_ACPN_TERNL_IND;
	
//	VNDR_MSG_TXT	VARCHAR2(1000 BYTE)
	@Column(name = "VNDR_MSG_TXT", columnDefinition = "char", length = 1000)
	@JsonProperty("VNDR_MSG_TXT")
	private String VNDR_MSG_TXT;
	
//	CRTN_GTS	TIMESTAMP(6)
	@Column(name = "CRTN_GTS")
	@JsonProperty("CRTN_GTS")
	private Timestamp CRTN_GTS;
	
//	CRTN_GDT	DATE
	@Column(name = "CRTN_GDT")
	@Temporal(TemporalType.DATE)
	@JsonProperty("CRTN_GDT")
	private Date CRTN_GDT;
	
//	LST_UPDT_GTS	TIMESTAMP(6)
	@Column(name = "LST_UPDT_GTS")
	@JsonProperty("LST_UPDT_GTS")
	private Timestamp LST_UPDT_GTS;
	
//	CARD_VRFN_RSLT_CD	VARCHAR2(3 BYTE)
	@Column(name = "CARD_VRFN_RSLT_CD", columnDefinition = "char", length = 3)
	@JsonProperty("CARD_VRFN_RSLT_CD")
	private String CARD_VRFN_RSLT_CD;
	
//	CARD_SCHM_TRNS_ID	VARCHAR2(20 BYTE)
	@Column(name = "CARD_SCHM_TRNS_ID", columnDefinition = "char", length = 20)
	@JsonProperty("CARD_SCHM_TRNS_ID")
	private String CARD_SCHM_TRNS_ID;
	
//	ACCTHLDR_ATHN_CD	VARCHAR2(3 BYTE)
	@Column(name = "ACCTHLDR_ATHN_CD", columnDefinition = "char", length = 3)
	@JsonProperty("ACCTHLDR_ATHN_CD")
	private String ACCTHLDR_ATHN_CD;
	
//	AGT_SCTY_ID	VARCHAR2(10 BYTE)
	@Column(name = "AGT_SCTY_ID", columnDefinition = "char", length = 10)
	@JsonProperty("AGT_SCTY_ID")
	private String AGT_SCTY_ID;
	
//	PNR_REC_LOCR_CD	VARCHAR2(6 BYTE)
	@Column(name = "PNR_REC_LOCR_CD", columnDefinition = "char", length = 6)
	@JsonProperty("PNR_REC_LOCR_CD")
	private String PNR_REC_LOCR_CD;
	
//	SCA_IND	VARCHAR2(6 BYTE)
	@Column(name = "SCA_IND", columnDefinition = "char", length = 3)
	@JsonProperty("SCA_IND")
	private String SCA_IND;
	
//	PT_OF_ORIG_CTRY_CD	VARCHAR2(3 BYTE)
	@Column(name = "PT_OF_ORIG_CTRY_CD", columnDefinition = "char", length = 3)
	@JsonProperty("PT_OF_ORIG_CTRY_CD")
	private String PT_OF_ORIG_CTRY_CD;
	
//	TNAIR_PRD_PD_AMT	NUMBER(38,8)
	@Column(name = "TNAIR_PRD_PD_AMT", precision = 38, scale = 8)
	@JsonProperty("TNAIR_PRD_PD_AMT")
	private BigDecimal TNAIR_PRD_PD_AMT;
	
//	PRTNR_TRNS_ID	VARCHAR2(3 BYTE)
	@Column(name = "PRTNR_TRNS_ID", columnDefinition = "char", length = 3)
	@JsonProperty("PRTNR_TRNS_ID")
	private String PRTNR_TRNS_ID;
	
//	ALT_AWD_RULE_CD	VARCHAR2(20 BYTE)
	@Column(name = "ALT_AWD_RULE_CD", columnDefinition = "char", length = 20)
	@JsonProperty("ALT_AWD_RULE_CD")
	private String ALT_AWD_RULE_CD;
	
//	PRD_LOC_CD	VARCHAR2(30 BYTE)
	@Column(name = "PRD_LOC_CD", columnDefinition = "char", length = 30)
	@JsonProperty("PRD_LOC_CD")
	private String PRD_LOC_CD;
	
//	TOT_DBTD_MI_CT	NUMBER
	@Column(name = "TOT_DBTD_MI_CT")
	@JsonProperty("TOT_DBTD_MI_CT")
	private BigInteger TOT_DBTD_MI_CT;
	
//	EBUS_PRD_CD	VARCHAR2(30 BYTE)
	@Column(name = "EBUS_PRD_CD", columnDefinition = "char", length = 30)
	@JsonProperty("EBUS_PRD_CD")
	private String EBUS_PRD_CD;
	
//	PRTNR_CD	VARCHAR2(3 BYTE)
	@Column(name = "PRTNR_CD", columnDefinition = "char", length = 3)
	@JsonProperty("PRTNR_CD")
	private String PRTNR_CD;
	
//	APCN_TRNS_ID	VARCHAR2(30 BYTE)
	@Column(name = "APCN_TRNS_ID", columnDefinition = "char", length = 30)
	@JsonProperty("APCN_TRNS_ID")
	private String APCN_TRNS_ID;
	
//	LOY_MBR_ID	VARCHAR2(25 BYTE)
	@Column(name = "LOY_MBR_ID", columnDefinition = "char", length = 25)
	@JsonProperty("LOY_MBR_ID")
	private String LOY_MBR_ID;
	
//	CHAT_SESS_ID	VARCHAR2(50 BYTE)
	@Column(name = "CHAT_SESS_ID", columnDefinition = "char", length = 50)
	@JsonProperty("CHAT_SESS_ID")
	private String CHAT_SESS_ID;
	
//	AUTH_PVDR_VER_TXT	VARCHAR2(50 BYTE)
	@Column(name = "AUTH_PVDR_VER_TXT", columnDefinition = "char", length = 50)
	@JsonProperty("AUTH_PVDR_VER_TXT")
	private String AUTH_PVDR_VER_TXT;
	
//	AUTH_LIFE_SPN_MNT_CT	NUMBER
	@Column(name = "AUTH_LIFE_SPN_MNT_CT")
	@JsonProperty("AUTH_LIFE_SPN_MNT_CT")
	private BigInteger AUTH_LIFE_SPN_MNT_CT;
	
//	SRZD_OBJ_TXT	BLOB
	@Lob
	@Column(name = "SRZD_OBJ_TXT")
	@JsonProperty("SRZD_OBJ_TXT")
	private String SRZD_OBJ_TXT;
	
//	SRZD_OBJ_VER_ID	VARCHAR2(10 BYTE)
	@Column(name = "SRZD_OBJ_VER_ID", columnDefinition = "char", length = 10)
	@JsonProperty("SRZD_OBJ_VER_ID")
	private String SRZD_OBJ_VER_ID;
	
//	REQ_CHNL_ID	VARCHAR2(10 BYTE)
	@Column(name = "REQ_CHNL_ID", columnDefinition = "char", length = 10)
	@JsonProperty("REQ_CHNL_ID")
	private String REQ_CHNL_ID;
	
//	PMT_HS_SRVR_NM	VARCHAR2(50 BYTE)
	@Column(name = "PMT_HS_SRVR_NM", columnDefinition = "char", length = 50)
	@JsonProperty("PMT_HS_SRVR_NM")
	private String PMT_HS_SRVR_NM;
	
//	EMD_DOC_NB	VARCHAR2(15 BYTE)
	@Column(name = "EMD_DOC_NB", columnDefinition = "char", length = 15)
	@JsonProperty("EMD_DOC_NB")
	private String EMD_DOC_NB;
	
//	EMD_ISS_DT	DATE
	@Column(name = "EMD_ISS_DT")
	@Temporal(TemporalType.DATE)
	@JsonProperty("EMD_ISS_DT")
	private Date EMD_ISS_DT;
	
//	CRTN_USR_ID	VARCHAR2(13 BYTE)
	@Column(name = "CRTN_USR_ID", columnDefinition = "char", length = 13)
	@JsonProperty("CRTN_USR_ID")
	private String CRTN_USR_ID;
	
//	LST_UPDT_USR_ID	VARCHAR2(13 BYTE)
	@Column(name = "LST_UPDT_USR_ID", columnDefinition = "char", length = 13)
	@JsonProperty("LST_UPDT_USR_ID")
	private String LST_UPDT_USR_ID;
	
//	PRNT_PMT_RFRN_ID	VARCHAR2(60 BYTE)
	@Column(name = "PRNT_PMT_RFRN_ID", columnDefinition = "char", length = 60)
	@JsonProperty("PRNT_PMT_RFRN_ID")
	private String PRNT_PMT_RFRN_ID;
	
//	PURCH_PTH_TXT	VARCHAR2(50 BYTE)
	@Column(name = "PURCH_PTH_TXT", columnDefinition = "char", length = 50)
	@JsonProperty("PURCH_PTH_TXT")
	private String PURCH_PTH_TXT;
	
//	APCN_ID	VARCHAR2(25 BYTE)
	@Column(name = "APCN_ID", columnDefinition = "char", length = 25)
	@JsonProperty("APCN_ID")
	private String APCN_ID;
	
//	EMV_DATA_TXT	VARCHAR2(4000 BYTE)
	@Column(name = "EMV_DATA_TXT", columnDefinition = "char", length = 4000)
	@JsonProperty("EMV_DATA_TXT")
	private String EMV_DATA_TXT;
	
//	VNDR_STAN_NB	VARCHAR2(25 BYTE)
	@Column(name = "VNDR_STAN_NB", columnDefinition = "char", length = 25)
	@JsonProperty("VNDR_STAN_NB")
	private String VNDR_STAN_NB;
	
//	VNDR_RRN_NB	VARCHAR2(25 BYTE)
	@Column(name = "VNDR_RRN_NB", columnDefinition = "char", length = 25)
	@JsonProperty("VNDR_RRN_NB")
	private String VNDR_RRN_NB;
	
//	VNDR_ORD_ID	VARCHAR2(60 BYTE)
	@Column(name = "VNDR_ORD_ID", columnDefinition = "char", length = 60)
	@JsonProperty("VNDR_ORD_ID")
	private String VNDR_ORD_ID;
	
//	VNDR_TRNS_DT_TXT	VARCHAR2(25 BYTE)
	@Column(name = "VNDR_TRNS_DT_TXT", columnDefinition = "char", length = 25)
	@JsonProperty("VNDR_TRNS_DT_TXT")
	private String VNDR_TRNS_DT_TXT;
}
