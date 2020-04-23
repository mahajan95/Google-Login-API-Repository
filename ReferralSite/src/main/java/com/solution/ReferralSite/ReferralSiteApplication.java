package com.solution.ReferralSite;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ReferralSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferralSiteApplication.class, args);
	}
	
	@RequestMapping(value = "/user")
	   public Principal user(Principal principal) {
	      return principal;
	   }

}
