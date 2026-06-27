package com.WebApplication.ChatApplication.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.WebApplication.ChatApplication.Model.Chat;
import com.WebApplication.ChatApplication.Model.User;
import com.WebApplication.ChatApplication.Service.ChatService;
import com.WebApplication.ChatApplication.Service.UserService;

@RestController
public class ChatController {
	
	@Autowired
	private ChatService chatService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/api/chats")
	public Chat createChat(
			@RequestHeader("Authorization") String jwt,
			@RequestBody CreateChatRequest user2) throws Exception
	{
	    User reqUser= userService.finduserProfileByjwt(jwt);
		//from Jwt we get requseted user who want to chat and user2 is user from whom req user want to chat
		
	    // Note: You can pass specific data from controller just create a class with the field you want to take from front end.
	    //here we're getting user2 Id from front-end so you have to pass this on response body with JSON format.
	    
	    //if you want to pass user2 data from front-end then pass user2 Id from URL by using PathVaribale and fetch in there by using Id 
	    //from the below code you have to see you also write this code but without using user2.getUserId() but in that case you have to pass the id in path varibale.
	    
	    User user1=userService.findById(user2.getUserId());
		Chat chat=chatService.createChat(reqUser, user1);
		
		System.out.println(chat);
		return chat;
		
	}
	
	@GetMapping("/api/chats")
	public List<Chat> findUserAllChatById(
			@RequestHeader("Authorization") String jwt  )
	{
		User user=userService.finduserProfileByjwt(jwt);
		Integer userId=user.getId();
		List<Chat> chats=chatService.findUserChatById(userId);
		return chats;
		
	}
	
	
	
	

}
