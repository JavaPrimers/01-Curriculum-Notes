package com.revature.service;

import com.revature.models.User;

public interface UserService {

	boolean verify(String username, String password);

	User getUser(String username);

}
