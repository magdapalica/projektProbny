package com.fdmgroup.springbootprobaexample.service;

import java.util.List;


import com.fdmgroup.springbootprobaexample.model.User;

public interface UserService {
	User getCurrentUser(Integer id);

//	@Autowired
//	private UserRepository repo;
//	
//	public List<User> findAllCoupons(){
//		return repo.findAll();
//	}
	
}
