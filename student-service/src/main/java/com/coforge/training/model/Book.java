package com.coforge.training.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

	private Integer bookId;
	private String bookName;
	private Double bookCost;
}
