package com.bnp.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bnp.domain.Accounts;
import com.bnp.domain.AccountsDTO;

public interface UserAccountRepository extends CrudRepository<Accounts, Long> {

	@Modifying
	@Query("Update Accounts a set a.ACCOUNT_NAME= :name AND a.PHONE= :phone AND a.email= :email AND a.STATUS= :status")
	AccountsDTO updateAccountDetails(@Param("name") String name, @Param("phone") Integer phone,
			@Param("email") String email, @Param("status") String status);
}
