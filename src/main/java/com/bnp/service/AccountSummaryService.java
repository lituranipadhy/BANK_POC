package com.bnp.service;

import java.util.List;

import com.bnp.domain.TransactionsDTO;

public interface AccountSummaryService {

	List<TransactionsDTO> findAll();
	
	String withdrawalOrDepositeRequest(TransactionsDTO transactionsDTO);
}
