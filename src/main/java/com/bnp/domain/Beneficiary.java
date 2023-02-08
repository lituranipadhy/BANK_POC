package com.bnp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beneficiary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACCOUNT_ID")
	private Long accountId;

	@Column(name = "BENE_ACCOUNT_ID")
	private Long beneAccountId;

	@Column(name = "BENE_IFSCCODE")
	private String beneIfscCode;
	
	@Column(name = "BENE_NAME")
	private String beneName;
	
	@Column(name = "STATUS")
	private String status;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getBeneAccountId() {
		return beneAccountId;
	}

	public void setBeneAccountId(Long beneAccountId) {
		this.beneAccountId = beneAccountId;
	}

	public String getBeneIfscCode() {
		return beneIfscCode;
	}

	public void setBeneIfscCode(String beneIfscCode) {
		this.beneIfscCode = beneIfscCode;
	}

	public String getBeneName() {
		return beneName;
	}

	public void setBeneName(String beneName) {
		this.beneName = beneName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
