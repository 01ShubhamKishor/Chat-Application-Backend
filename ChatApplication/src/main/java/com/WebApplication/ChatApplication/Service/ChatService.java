package com.WebApplication.ChatApplication.Service;
import java.util.List;
import com.WebApplication.ChatApplication.Model.Chat;
import com.WebApplication.ChatApplication.Model.User;


public interface ChatService {
	
	public Chat createChat(User user ,User user2);
	
	public Chat findChatById(Integer chatId ) throws Exception;
	
	public List<Chat> findUserChatById(Integer userId);
	


}
