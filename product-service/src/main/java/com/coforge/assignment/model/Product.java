package com.coforge.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	Long productId;
	String productName;
	Double price;
	Long CustId;

}
