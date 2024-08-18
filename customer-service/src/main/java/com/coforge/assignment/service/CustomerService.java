package com.coforge.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.coforge.assignment.model.Product;

@Service
public class CustomerService {

	@Autowired
	private RestTemplate restTemplate;
	
	
	public List<Product> showProducts(@PathVariable("id") int id) {
		System.out.println(id);

		List<Product> products = restTemplate.exchange(
		"http://PRODUCT/products/{CustId}", HttpMethod.GET, null, new
		ParameterizedTypeReference<List<Product>>(){}, id).getBody();
		return products;
		}
	
	
	
	
	
	
}
