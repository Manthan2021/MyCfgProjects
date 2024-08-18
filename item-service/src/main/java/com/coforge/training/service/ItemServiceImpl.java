package com.coforge.training.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.training.controller.ItemRestController;
import com.coforge.training.model.Item;
import com.coforge.training.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{

	private Logger log = LoggerFactory.getLogger(ItemRestController.class);
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Override
	public List<Item> findAllItems() {
		// TODO Auto-generated method stub
		
		log.info("Response By Item Microservice");
		return itemRepo.findAll();
	}

	@Override
	
	public Item saveNewItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(item);
	}

	@Override
	public List<Item> findAllItemsByUserId(Long id) {
		// TODO Auto-generated method stub
		return itemRepo.findAllByUserId(id);
	}

}
