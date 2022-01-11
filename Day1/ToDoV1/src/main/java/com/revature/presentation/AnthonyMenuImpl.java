package com.revature.presentation;

import java.util.List;

import com.revature.models.ToDo;
import com.revature.service.UserService;

public class AnthonyMenuImpl implements UserMenu {

	
	private UserService uService;
	
	public AnthonyMenuImpl(UserService uService) {
		super();
		this.uService = uService;
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showList(List<ToDo> list) {
		// TODO Auto-generated method stub

	}

}
