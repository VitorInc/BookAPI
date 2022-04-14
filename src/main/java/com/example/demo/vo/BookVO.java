package com.example.demo.vo;

import java.time.LocalDate;

public class BookVO {

	private Long idVO;

	private String nameVO;
	private String genderVO;
	private LocalDate dateVO;
	private Double priceVO;

	public Long getIdVO() {
		return idVO;
	}

	public void setIdVO(Long idVO) {
		this.idVO = idVO;
	}

	public String getNameVO() {
		return nameVO;
	}

	public void setNameVO(String nameVO) {
		this.nameVO = nameVO;
	}

	public String getGenderVO() {
		return genderVO;
	}

	public void setGenderVO(String genderVO) {
		this.genderVO = genderVO;
	}

	public LocalDate getDateVO() {
		return dateVO;
	}

	public void setDateVO(LocalDate dateVO) {
		this.dateVO = dateVO;
	}

	public Double getPriceVO() {
		return priceVO;
	}

	public void setPriceVO(Double priceVO) {
		this.priceVO = priceVO;
	}

}
