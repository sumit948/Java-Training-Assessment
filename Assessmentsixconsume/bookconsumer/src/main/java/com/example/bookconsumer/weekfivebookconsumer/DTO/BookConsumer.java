package com.example.bookconsumer.weekfivebookconsumer.DTO;

import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookConsumer {
	public Book book;

	public String getBookData() {
		// TODO Auto-generated method stub
		return "Getting Books Data";
	}

	public String getAllBooks() {
		// TODO Auto-generated method stub
		return "Getting all books";
	}

	public String getBookById(Integer id) {
		// TODO Auto-generated method stub
		return "Getting get book by id";
	}

	public ResponseEntity<String> getEntityData() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
