package com.solution.ReferralSite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solution.ReferralSite.model.CompanyJob;
import com.solution.ReferralSite.repository.CompanyJobRepository;

@Service
public class ComanyJobServiceImpl implements CompanyJobService{

	@Autowired
	CompanyJobRepository companyJobRepository;

	@Override
	public CompanyJob postAlljobs(CompanyJob companyJob) {
	
		return companyJobRepository.save(companyJob);
	}

	@Override
	public List<CompanyJob> getAllJobList() {
		return companyJobRepository.findAll();	
	}
	
	
	
	
}
