package com.bnp.service;

import java.util.List;

import com.bnp.domain.BeneficiaryDTO;

public interface BeneficiaryService {

	BeneficiaryDTO saveBeneficiary(BeneficiaryDTO beneficiaryDTO);

	BeneficiaryDTO updateBeneficiary(BeneficiaryDTO beneficiaryDTO);

	BeneficiaryDTO deleteBeneficiary(BeneficiaryDTO beneficiaryDTO);

	List<BeneficiaryDTO> findAllBeneficiary();

}
