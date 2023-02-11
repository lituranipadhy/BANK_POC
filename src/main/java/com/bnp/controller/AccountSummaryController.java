package com.bnp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.domain.TransactionsDTO;
import com.bnp.repository.AccountSummaryRepository;

@RestController("/transaction")
public class AccountSummaryController {

	private AccountSummaryRepository accountSummaryRepository;

	@Autowired
	public AccountSummaryController(AccountSummaryRepository accountSummaryRepository) {
		this.accountSummaryRepository = accountSummaryRepository;
	}

	@GetMapping("/allTransaction")
	public List<TransactionsDTO> allTransaction() {
		return (List<TransactionsDTO>) accountSummaryRepository.findAll();
	}

}
