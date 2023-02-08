package com.bnp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnp.domain.Beneficiary;
import com.bnp.domain.BeneficiaryDTO;
import com.bnp.repository.BeneficiaryRepository;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

	private final BeneficiaryRepository beneficiaryRepository;

	@Autowired
	public BeneficiaryServiceImpl(BeneficiaryRepository beneficiaryRepository) {
		this.beneficiaryRepository = beneficiaryRepository;
	}

	@Override
	public BeneficiaryDTO saveBeneficiary(BeneficiaryDTO beneficiaryDTO) {
		try {
			beneficiaryDTO = beneficiaryRepository.save(beneficiaryDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return beneficiaryDTO;
	}

	@Override
	public BeneficiaryDTO updateBeneficiary(BeneficiaryDTO beneficiaryDTO) {
		BeneficiaryDTO beneficiary = null;
		Long BENE_ACCOUNT_ID = null;
		if (beneficiaryDTO.getBeneAccountId() != null) {

			BENE_ACCOUNT_ID = beneficiaryDTO.getBeneAccountId();
			try {
				beneficiary = beneficiaryRepository.updateBeneficiary(BENE_ACCOUNT_ID);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return beneficiary;
	}

	@Override
	public BeneficiaryDTO deleteBeneficiary(BeneficiaryDTO beneficiaryDTO) {
		BeneficiaryDTO beneficiary = new BeneficiaryDTO();
		Long BENE_ACCOUNT_ID = null;
		if (beneficiaryDTO.getBeneAccountId() != null) {

			BENE_ACCOUNT_ID = beneficiaryDTO.getBeneAccountId();
			try {
				beneficiary = beneficiaryRepository.deleteBeneficiary(BENE_ACCOUNT_ID);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return beneficiary;
	}

	@Override
	public List<BeneficiaryDTO> findAllBeneficiary() {
		return (List<BeneficiaryDTO>) beneficiaryRepository.findAll();
	}

}
