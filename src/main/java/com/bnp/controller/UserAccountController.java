package com.bnp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.domain.AccountsDTO;
import com.bnp.service.UserAccountService;

@RestController("/userAccount")
public class UserAccountController {

	private UserAccountService accountService;

	@Autowired
	public UserAccountController(UserAccountService accountService) {
		this.accountService = accountService;
	}

	@PostMapping("/update")
	public ResponseEntity<AccountsDTO> updateUser(@Validated AccountsDTO accountsDTO) {
		AccountsDTO updatedUser = accountService.updatePersonalDetails(accountsDTO);
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	}

}
