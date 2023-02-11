package com.bnp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.domain.TransactionsDTO;
import com.bnp.service.AccountSummaryService;

@RestController("/transaction")
public class AccountSummaryController {

	private AccountSummaryService accountSummaryService;

	@Autowired
	public AccountSummaryController(AccountSummaryService accountSummaryService) {
		this.accountSummaryService = accountSummaryService;
	}

	@GetMapping("/allTransaction")
	public List<TransactionsDTO> allTransaction() {
		return accountSummaryService.findAll();
	}

	@PostMapping("/withdrawalDeposite")
	public String withdrawalDeposite(TransactionsDTO transactionsDTO) {
		return accountSummaryService.withdrawalOrDepositeRequest(transactionsDTO);
	}

}
