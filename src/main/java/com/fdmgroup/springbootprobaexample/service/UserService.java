package com.fdmgroup.springbootprobaexample.service;

import com.fdmgroup.springbootprobaexample.model.User;

public interface UserService {

	User getCurrentUser(String username);
	
	User updateUser(User user);
	
}
