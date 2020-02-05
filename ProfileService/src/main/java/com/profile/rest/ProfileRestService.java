package com.profile.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileRestService {

	@GetMapping("/profile")
	public String getPaymentData(){
		return "Profile Data";
	}
	
}
