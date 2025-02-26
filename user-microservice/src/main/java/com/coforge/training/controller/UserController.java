package com.coforge.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.model.Account;
import com.coforge.training.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController {

	@Autowired
	public UserService userService;
	
	
	@GetMapping(value="/user/{id}")
	public List<Account> showEmployees(@PathVariable("id") int id) {
		
		List<Account> accounts = userService.showEmployees(id);
		// displaying accounts
		
		for(Account acct : accounts) {
		
			System.out.println(acct.getEmpId());
			System.out.println(acct.getAccountId());
			System.out.println(acct.getBranch());
		}
		return accounts;
	}
	
}
