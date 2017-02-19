package com.zhouxl.ssm.dto;

public class Result<T> {
	private boolean success;
	
	private T data;
	
	private String error;
	
	public Result() {
		
	}
	
	public Result(boolean success, T data) {
		this.success = success;
		this.data = data;
	}
	
	public Result(boolean success, String error) {
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public T getData() {
		return data;
	}

	public String getError() {
		return error;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}
