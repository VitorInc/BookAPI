package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author joaovitor
 *
 */
public class WriterEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	
	private String name;
	private String country;
	private List<BookEntity> books;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<BookEntity> getBooks() {
		return books;
	}
	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}

	

}
