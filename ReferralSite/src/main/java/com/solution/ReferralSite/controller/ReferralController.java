package com.solution.ReferralSite.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.solution.ReferralSite.model.CompanyJob;
import com.solution.ReferralSite.service.CompanyJobService;

@RestController
public class ReferralController {
	
	
	@Autowired
	CompanyJobService companyJobService;
	
	
	@RequestMapping(value = "/user")
	   public Principal user(Principal principal) {
	      return principal;
	   }
	
	/*
	 * Addjob post Api
	 */
	@RequestMapping(value="/addjobpost",method=RequestMethod.POST)
	public CompanyJob addPostTocompanyPortal(@RequestBody CompanyJob companyJob) {
		return companyJobService.postAlljobs(companyJob);
	}
	
	
	/* getAlljobPost */
	@RequestMapping(value="/getAlljobpost",method=RequestMethod.GET)
	public List<CompanyJob> getAllPostTocompanyPortal() {
		return companyJobService.getAllJobList();
	}
	
	
	
	
}
