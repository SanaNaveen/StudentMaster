package com.study.MasterStudent.MasterDto;

import java.util.List;

public class ResponseDto<T> {

	private String id;
	
	private String status;
	
	private List<T> responseDto;
	
	private Object responseData;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<T> getResponseDto() {
		return responseDto;
	}

	public void setResponseDto(List<T> responseDto) {
		this.responseDto = responseDto;
	}

	public Object getResponseData() {
		return responseData;
	}

	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}
	
	
	
	
}
