package com.solution.ReferralSite.service;

import java.util.List;

import com.solution.ReferralSite.model.CompanyJob;

public interface CompanyJobService {
	

	public CompanyJob postAlljobs(CompanyJob companyJob);
	public List<CompanyJob> getAllJobList();
}
