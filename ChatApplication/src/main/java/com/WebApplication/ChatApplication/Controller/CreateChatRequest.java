package com.WebApplication.ChatApplication.Controller;


import lombok.Data;

@Data //getter and setter
public class CreateChatRequest {
	
	private Integer userId;
//	private User reqUser;
	
//	public User getReqUser() {
//		return reqUser;
//	}
//	public void setReqUser(User reqUser) {
//		this.reqUser = reqUser;
//	}
	private CreateChatRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	private CreateChatRequest(Integer userId) {
		super();
		this.userId = userId;
	}
	
	
	
	
	
	

}
