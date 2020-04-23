package com.solution.ReferralSite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solution.ReferralSite.model.CompanyJob;

@Repository
public interface CompanyJobRepository extends JpaRepository<CompanyJob,Integer> {

}
