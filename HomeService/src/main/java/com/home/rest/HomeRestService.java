package com.home.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeRestService {

	@GetMapping("/home")
	public String getHomeData(){
		
		final String uri = "http://localhost:1234/profile";

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    
	    final String uri1 = "http://localhost:1235/payment";

	    String result1 = restTemplate.getForObject(uri1, String.class);
		
		return "Home   " + result + "   " + result1;
	}
	
}
