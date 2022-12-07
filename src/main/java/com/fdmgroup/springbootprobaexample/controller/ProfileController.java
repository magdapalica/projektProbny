package com.fdmgroup.springbootprobaexample.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.springbootprobaexample.model.User;
import com.fdmgroup.springbootprobaexample.service.UserService;



@Controller
public class ProfileController{
	private UserService userService;

	@Autowired
	public ProfileController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/personal")
	public String goToProfile(ModelMap model) {
		Integer id = 1; 
		model.addAttribute("user", userService.getCurrentUser(id));
		return "personal";
	}
	
}