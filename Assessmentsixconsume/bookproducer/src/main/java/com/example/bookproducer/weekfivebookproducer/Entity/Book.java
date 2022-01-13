package com.example.bookproducer.weekfivebookproducer.Entity;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private Integer bookId;
    private String bookName;
    private Double bookCost;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookCost, bookId, bookName);
	}
	
	public Book(Integer bookId, String bookName, Double bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookCost, other.bookCost) && Objects.equals(bookId, other.bookId)
				&& Objects.equals(bookName, other.bookName);
	}
    
}
