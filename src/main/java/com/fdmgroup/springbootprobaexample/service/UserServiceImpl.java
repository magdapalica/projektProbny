package com.fdmgroup.springbootprobaexample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.springbootprobaexample.model.User;
import com.fdmgroup.springbootprobaexample.repository.UserRepository;
import com.fdmgroup.springbootprobaexample.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository repo;

	@Autowired
	public UserServiceImpl(UserRepository repo) {
		this.repo = repo;
	}

	@Override
	public User getCurrentUser(Integer id) {
		Optional<User> currentUser = repo.findById(id);
		return currentUser.orElse(null);
	}
}
