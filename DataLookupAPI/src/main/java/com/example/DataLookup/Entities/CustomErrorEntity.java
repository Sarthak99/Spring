package com.example.DataLookup.Entities;

import org.springframework.http.HttpStatus;

public class CustomErrorEntity {

	private String message;
	private HttpStatus code;
	private String status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getCode() {
		return code;
	}
	public void setCode(HttpStatus internalServerError) {
		this.code = internalServerError;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
