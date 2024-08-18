package com.coforge.assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coforge.assignment.model.Product;

@Service
public class ProductService {
	
	private List<Product> getProductList()
	{
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(1L,"Jacket",5000.0,101L));
		productList.add(new Product(2L,"Sweater",2000.0,102L));
		productList.add(new Product(3L,"Socks",100.0,101L));
		productList.add(new Product(4L,"jeans",2000.0,102L));
		productList.add(new Product(5L,"blanket",500.0,103L));
		productList.add(new Product(6L,"shirt",1000.0,101L));
		productList.add(new Product(7L,"Heater",6000.0,102L));
		productList.add(new Product(8L,"Refrigerator",15000.0,103L));
		 
		return productList;
		
		
	}
	
	public List<Product> findProductsByCustId(int CustId){
     
		List<Product> productList=getProductList();
		
		List<Product>  custProductList=new ArrayList<>();
		
		for(Product product:productList)
		{
		if(product.getCustId()==(CustId)) 
			custProductList.add(product);
			
		}
			return custProductList;
			
	}
		
}	

	
