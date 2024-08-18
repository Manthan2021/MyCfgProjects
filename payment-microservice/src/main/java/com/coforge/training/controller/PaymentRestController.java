package com.coforge.training.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/data")
    public String  getPaymentData() {
	
	String response=restTemplate.getForObject("http://CART-SERVICE/cart/getData",String.class);
	
	return "From Payment Service : "+response;
     }
	
	
	
}
