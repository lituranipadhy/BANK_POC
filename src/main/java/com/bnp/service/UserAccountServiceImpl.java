package com.bnp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bnp.domain.AccountsDTO;
import com.bnp.repository.UserAccountRepository;

public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountRepository accountRepository;

	@Override
	public AccountsDTO updatePersonalDetails(AccountsDTO accountsDTO) {
		String name = null;
		Integer phone = null;
		String email = null;
		String status = null;

		if (accountsDTO != null) {
			name = accountsDTO.getAccountName();
			phone = accountsDTO.getPhone();
			email = accountsDTO.getEmail();
			status = accountsDTO.getStatus();

		}
		return accountRepository.updateAccountDetails(name, phone, email, status);
	}

}
