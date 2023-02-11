package com.bnp.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bnp.domain.BeneficiaryDTO;

public interface BeneficiaryRepository extends CrudRepository<BeneficiaryDTO, Long> {

	@Modifying
	@Query("update Beneficiary b set b.status = active where b.BENE_ACCOUNT_ID = :BENE_ACCOUNT_ID")	
	BeneficiaryDTO updateBeneficiary(@Param("BENE_ACCOUNT_ID") Long BENE_ACCOUNT_ID);

	@Modifying
	@Query("delete Beneficiary b where b.BENE_ACCOUNT_ID < :BENE_ACCOUNT_ID")
	BeneficiaryDTO deleteBeneficiary(@Param("BENE_ACCOUNT_ID") Long BENE_ACCOUNT_ID);
}
