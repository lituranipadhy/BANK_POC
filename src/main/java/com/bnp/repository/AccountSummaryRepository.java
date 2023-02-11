package com.bnp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bnp.domain.TransactionsDTO;

public interface AccountSummaryRepository extends CrudRepository<TransactionsDTO, Long> {

}
