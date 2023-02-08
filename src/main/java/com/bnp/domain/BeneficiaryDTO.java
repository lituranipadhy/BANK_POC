package com.bnp.domain;

public class BeneficiaryDTO {

	private Long accountId;

	private Long beneAccountId;

	private String beneIfscCode;

	private String beneName;

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
