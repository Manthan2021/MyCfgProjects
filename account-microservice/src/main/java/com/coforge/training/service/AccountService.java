package com.coforge.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coforge.training.model.Account;

@Service
public class AccountService {

	private List<Account> getAccountList(){
		List<Account> accountList = new ArrayList<>();
		accountList.add(new Account(101, "SB111", "Bangalore"));
		accountList.add(new Account(101, "SB555", "Mumbai"));
		accountList.add(new Account(102, "SB676", "Delhi"));
		accountList.add(new Account(101, "SB456", "Mumbai"));
		accountList.add(new Account(101, "SB908", "Kanpur"));
		accountList.add(new Account(102, "SB123", "Noida"));
		accountList.add(new Account(103, "SB009", "Bangalore"));
		
		return accountList;
		}
	
	public List<Account> findAccountsByEmpId(int empId){

		List<Account> accountList = getAccountList();

		List<Account> empAccountList = new ArrayList<>();

		for(Account account : accountList) {

		if(account.getEmpId() == (empId))
		
			empAccountList.add(account);
		}
		return empAccountList;
		}
	
	
	
	
}
