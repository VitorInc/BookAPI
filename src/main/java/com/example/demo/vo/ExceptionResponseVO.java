package com.example.demo.vo;

import java.io.Serializable;

public class ExceptionResponseVO implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String type;
	private String title;
	private String detail;
	private String instance;
			
	public ExceptionResponseVO(String type, String title, String detail, String instance) {
		super();
		this.type = type;
		this.title = title;
		this.detail = detail;
		this.instance = instance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}

	
}
