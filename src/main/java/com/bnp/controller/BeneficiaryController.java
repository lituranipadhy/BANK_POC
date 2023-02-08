package com.bnp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.domain.BeneficiaryDTO;
import com.bnp.service.BeneficiaryService;

@RestController("/Beneficiary")
public class BeneficiaryController {

	private BeneficiaryService beneficiaryService;

	@Autowired
	public BeneficiaryController(BeneficiaryService beneficiaryService) {
		this.beneficiaryService = beneficiaryService;
	}

	@PostMapping("/Add")
	public BeneficiaryDTO saveBeneficiary(@RequestBody BeneficiaryDTO beneficiaryDTO) {
		return beneficiaryService.saveBeneficiary(beneficiaryDTO);
	}
	
	@PutMapping("/Update")
	public BeneficiaryDTO updateBeneficiary(@RequestBody BeneficiaryDTO beneficiaryDTO) {
		return beneficiaryService.updateBeneficiary(beneficiaryDTO);
	}
	
	@DeleteMapping("/Delete")
	public BeneficiaryDTO deleteBeneficiary(@RequestBody BeneficiaryDTO beneficiaryDTO) {
		return beneficiaryService.deleteBeneficiary(beneficiaryDTO);
	}
	
	@GetMapping("/FindAll")
	public List<BeneficiaryDTO> findAllBeneficiary(){
		return beneficiaryService.findAllBeneficiary();
	}
}
