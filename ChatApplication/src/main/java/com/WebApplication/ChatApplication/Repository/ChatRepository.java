package com.WebApplication.ChatApplication.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.WebApplication.ChatApplication.Model.Chat;
import com.WebApplication.ChatApplication.Model.User;

public interface ChatRepository extends JpaRepository<Chat, Integer> {
	
	public List<Chat> findByUsersId(Integer userId);
	
	@Query("select c from Chat c Where :user Member of c.users AND :reqUser Member of c.users")
	public Chat findChatByUsersId(@Param("user") User user, @Param("reqUser") User reqUser);

}
