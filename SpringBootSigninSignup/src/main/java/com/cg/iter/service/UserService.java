package com.cg.iter.service;

import com.cg.iter.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	
	public void saveUser(User user);
	
}
