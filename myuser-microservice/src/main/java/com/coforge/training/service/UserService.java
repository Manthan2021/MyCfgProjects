package com.coforge.training.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.coforge.training.model.Item;

@Service
public class UserService {

	private Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private ItemServiceClient  itemServiceClient; //Instance of Feign Client
	
	

	public ResponseEntity<List<Item>> getAllItems()
	{
		log.info("Inside the user service");
		return itemServiceClient.getAllItems();
		

	}

}
