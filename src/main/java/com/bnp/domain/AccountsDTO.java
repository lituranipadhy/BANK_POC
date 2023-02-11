package com.bnp.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;

public class AccountsDTO {

	private Long accountId;

	private String accountName;

	@Digits(message="Number should contain 10 digits.", fraction = 0, integer = 10)
	private Integer phone;

	@NotNull
	@Pattern(regexp = "[^@\\s]+@[^@\\s]+\\.[^@\\s]+", flags = { Flag.CASE_INSENSITIVE }, message = "The email is invalid.")
	private String email;

	private String status;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
