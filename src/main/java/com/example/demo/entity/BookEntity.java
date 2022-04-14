package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class BookEntity implements Serializable{


	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	private String gender;
	private LocalDate date;
	private WriterEntity bookWrier;
	private Double price;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public WriterEntity getBookWrier() {
		return bookWrier;
	}
	public void setBookWrier(WriterEntity bookWrier) {
		this.bookWrier = bookWrier;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
