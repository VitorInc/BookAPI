package com.example.demo.vo;

import java.io.Serializable;

public class BookFilterVO implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private String languageVO;
	private String genreVO;
	private String authorVO;
	
	public boolean existsLanguage() {
		return this.languageVO != null && languageVO.isEmpty();
	}
	public boolean existsGenre() {
		return this.genreVO != null && genreVO.isEmpty();
	}
	public boolean existsAuthor() {
		return this.authorVO != null && authorVO.isEmpty();
	}
	
	public String getLanguageVO() {
		return languageVO;
	}
	public void setLanguageVO(String languageVO) {
		this.languageVO = languageVO;
	}

	public String getGenreVO() {
		return genreVO;
	}
	public void setGenreVO(String genreVO) {
		this.genreVO = genreVO;
	}
	public String getAuthorVO() {
		return authorVO;
	}
	public void setAuthorVO(String authorVO) {
		this.authorVO = authorVO;
	}
	
}
