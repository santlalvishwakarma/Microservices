package com.payment.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRestService {

	@GetMapping("/payment")
	public String getPaymentData(){
		return "Payment Data";
	}
	
}
