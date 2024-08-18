package com.coforge.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.assignment.model.Product;
import com.coforge.assignment.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@GetMapping(value="/products/{CustId}")
	public List<Product> getProductByCustId(@PathVariable int CustId){
	
		System.out.println("CustId-----------"+CustId);
	List<Product> custProductList=productService.findProductsByCustId(CustId);
	return custProductList;
	
	}
	
	
	
	
	
	
	
	
}
