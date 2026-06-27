package com.WebApplication.ChatApplication.Model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Chat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer chatId;
	
	private String chatName;
	
	private String  chatImage;
	
	@ManyToMany
	private List<User> users=new ArrayList<>();
	
	private LocalDateTime timeStamp;
	
	
	public int getChatId() {
		return chatId;
	}
	public void setChatId(int chatId) {
		this.chatId = chatId;
	}
	public String getChatName() {
		return chatName;
	}
	public void setChatName(String chatName) {
		this.chatName = chatName;
	}
	public String getChatImage() {
		return chatImage;
	}
	public void setChatImage(String chatImage) {
		this.chatImage = chatImage;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	private Chat(int chatId, String chatName, String chatImage, List<User> users, LocalDateTime timeStamp) {
		super();
		this.chatId = chatId;
		this.chatName = chatName;
		this.chatImage = chatImage;
		this.users = users;
		this.timeStamp = timeStamp;
	}
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Chat [chatId=" + chatId + ", chatName=" + chatName + ", chatImage=" + chatImage + ", users=" + users
				+ ", timeStamp=" + timeStamp + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
	

}
