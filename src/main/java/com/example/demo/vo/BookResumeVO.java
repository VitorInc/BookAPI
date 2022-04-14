package com.example.demo.vo;

import java.io.Serializable;

public class BookResumeVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nameVO;
	private String authorVO;
	private String genreVO;
	
	public String getNameVO() {
		return nameVO;
	}
	public void setNameVO(String nameVO) {
		this.nameVO = nameVO;
	}
	public String getAuthorVO() {
		return authorVO;
	}
	public void setAuthorVO(String authorVO) {
		this.authorVO = authorVO;
	}
	public String getGenreVO() {
		return genreVO;
	}
	public void setGenreVO(String genreVO) {
		this.genreVO = genreVO;
	}
	
	
}
