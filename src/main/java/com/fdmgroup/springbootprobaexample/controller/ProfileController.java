package com.fdmgroup.springbootprobaexample.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.springbootprobaexample.model.User;
import com.fdmgroup.springbootprobaexample.service.UserService;
import com.fdmgroup.springbootprobaexample.service.UserServiceImpl;



@Controller
public class ProfileController{
	private UserService userService;

	@Autowired
	public ProfileController(UserService userService) {
		this.userService = userService;
	}
	
	@Autowired
	private UserServiceImpl  userServiceImpl;
	
	private List<User> users = new ArrayList<User>();
	
	@GetMapping("/personal")
	public String goToProfile(ModelMap model) {
		Integer id = 1; 
		model.addAttribute("user", userService.getCurrentUser(id));
		return "personal";
	}
	@PostMapping( value="/personal")
	public String createNewUSer(ModelMap model,  @RequestParam String firstName, @RequestParam String lastName, @RequestParam double totalPrice) {
		User user =new User(firstName, lastName, totalPrice);
		users.add(user);
		model.addAttribute("users", users);
		userServiceImpl.createNewUser(user);
		populateModel(model);
		return "/personal";
	}
	private void populateModel(ModelMap model) {
		model.addAttribute("users", userServiceImpl.findAllUsers());
	}
}