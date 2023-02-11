package com.bnp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnp.constant.CommonConstant;
import com.bnp.domain.AccountBalance;
import com.bnp.domain.TransactionsDTO;
import com.bnp.repository.AccountSummaryRepository;
import com.bnp.repository.AmountBalanceRepository;

@Service
public class AccountSummaryServiceImpl implements AccountSummaryService {

	private AccountSummaryRepository accountSummaryRepository;

	@Autowired
	private AmountBalanceRepository amountBalanceRepository;

	@Autowired
	public AccountSummaryServiceImpl(AccountSummaryRepository accountSummaryRepository) {
		this.accountSummaryRepository = accountSummaryRepository;
	}

	@Override
	public List<TransactionsDTO> findAll() {
		return (List<TransactionsDTO>) accountSummaryRepository.findAll();
	}

	@Override
	public String withdrawalOrDepositeRequest(TransactionsDTO transactionsDTO) {
		String type = null;
		Long amount = null;
		Long accountBalance = null;
		if (transactionsDTO != null) {
			amount = transactionsDTO.getAmount();
			type = transactionsDTO.getType();
			if (CommonConstant.CREDIT.equals(type)) {
				transactionsDTO.setStatus("Success");
				accountSummaryRepository.save(transactionsDTO);
			} else if (CommonConstant.DEBIT.equals(type)) {
				Optional<AccountBalance> balance = amountBalanceRepository.findById(transactionsDTO.getAccountId());
				if (balance.isPresent()) {
					accountBalance = balance.get().getBalance();
				}
				if (amount > accountBalance) {
					return "request amount should not be greater than account balanch";
				}
				transactionsDTO.setStatus("Success");
				accountSummaryRepository.save(transactionsDTO);
			}
		}
		return "Your transaction successfully completed";
	}

}
