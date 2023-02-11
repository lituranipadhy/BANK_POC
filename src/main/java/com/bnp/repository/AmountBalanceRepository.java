package com.bnp.repository;

import org.springframework.data.repository.CrudRepository;

import com.bnp.domain.AccountBalance;

public interface AmountBalanceRepository extends CrudRepository<AccountBalance, Long> {

	
}
