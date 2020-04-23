package com.solution.ReferralSite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companyjobdata")
public class CompanyJob {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="jobid")
	public int jobid;
	
	@Column(name="title")
	public  String title;
	
	@Column(name="experience")
	public String experience;
	
	@Column(name="roledescription")
	public String roledescription;
	
	public  CompanyJob() {
		
	}

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getRoledescription() {
		return roledescription;
	}

	public void setRoledescription(String roledescription) {
		this.roledescription = roledescription;
	}

	@Override
	public String toString() {
		return "CompanyJob [jobid=" + jobid + ", title=" + title + ", experience=" + experience + ", roledescription="
				+ roledescription + "]";
	}
	
	
}
