package com.coforge.training.controlleer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.service.BookRestConsumer;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private BookRestConsumer consumer;

	@GetMapping("/allBooks")
	public String getBookInfo() {

		return "Accessing from Student Service through Feign Client -> " + consumer.getAllBooks();
	}

	@GetMapping("/getOneBook/{id}")
	public String getOneBook(@PathVariable Integer id) {

		return "Accessing from Student Service through Feign Client -> " + consumer.getBookById(id);
	}
	
	@GetMapping("/data")
	public String getStudentInfo() {
	System.out.println(consumer.getClass().getName()); //prints as a proxy class
	return "Accessing from STUDENT-SERVICE ==> " +consumer.getBookData();
	}
	
	@GetMapping("/entityData")
	public String printEntityData() {
	ResponseEntity<String> resp = consumer.getEntityData();
	return "Accessing from STUDENT-SERVICE ==> " + resp.getBody() +" , status is:" + resp.getStatusCode();
	}
}
