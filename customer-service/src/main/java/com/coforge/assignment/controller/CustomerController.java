package com.coforge.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.assignment.model.Product;
import com.coforge.assignment.service.CustomerService;

@RestController

public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	

	
	@GetMapping(value="/customer/{id}")
	public List<Product> showProducts(@PathVariable("id") int id) {
	List<Product> products = customerService.showProducts(id);
	// displaying accounts
	for(Product prdt : products) {
	System.out.println(prdt.getProductId());
	System.out.println(prdt.getProductName());
	System.out.println(prdt.getPrice());
	System.out.println(prdt.getCustId());
	}
	return products;
	}
	
	
}
