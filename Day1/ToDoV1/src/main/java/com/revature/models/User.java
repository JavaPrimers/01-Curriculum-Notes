package com.revature.models;

import java.util.List;

/**
 * This is the representation of the User class. Has username, password and List of ToDos. 
 * 
 * @author BenjaminArayathel
 *
 */
public class User {
	
	private String username;
	private String password;
	private List<ToDo> userToDoList;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, List<ToDo> userToDoList) {
		super();
		this.username = username;
		this.password = password;
		this.userToDoList = userToDoList;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<ToDo> getUserToDoList() {
		return userToDoList;
	}
	public void setUserToDoList(List<ToDo> userToDoList) {
		this.userToDoList = userToDoList;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", userToDoList=" + userToDoList + "]";
	}
	
	

}
