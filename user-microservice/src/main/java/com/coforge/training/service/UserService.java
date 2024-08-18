package com.coforge.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.coforge.training.model.Account;

@Service
public class UserService {
	
	/*restTemplate.exchange() is the method used for making remote call to another microservice.*/
	
	@Autowired
	private RestTemplate restTemplate;//configured to use as load balancer client

	public List<Account> showEmployees(@PathVariable("id") int id) {
		System.out.println(id);

		
		//Invokes Account Microservice
		//http://localhost:9001/accounts/101
		//ms in above format
		//To avoid hardcoding of URl,we use netflix Ribbon service(Eureka-Ribbon Load Balancer)
		
		
		
		List<Account> accounts = restTemplate.exchange(
		"http://ACCOUNT/accounts/{empId}", HttpMethod.GET, null, new
		ParameterizedTypeReference<List<Account>>(){}, id).getBody();
		return accounts;
		}
  }
	
	

