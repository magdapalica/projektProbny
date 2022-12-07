package com.fdmgroup.springbootprobaexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.springbootprobaexample.model.User;
import com.fdmgroup.springbootprobaexample.model.Coupon;
import com.fdmgroup.springbootprobaexample.service.CouponService;
import com.fdmgroup.springbootprobaexample.service.UserServiceImpl;

@Controller
public class CouponController {
	
	@Autowired
	private CouponService couponService;
	@Autowired
	private UserServiceImpl  userService;
	
	private List<Coupon> coupons = new ArrayList<Coupon>();

	@GetMapping( value="/")
	public String goToIndex(ModelMap model) {
		List<Coupon> coupons = couponService.findAllCoupons(); //pobieram wszystkie kupony
		List<User> users = userService.findAllUsers();
		model.addAttribute("coupons", coupons); //wysyłam do jsp
		model.addAttribute("users", users); 
		return "index";
	}
	@GetMapping( value="/add")
	public String goToAdd(ModelMap model) {
		populateModel(model);
		return "add";
	}
	
	@PostMapping( value="/add")
	public String createNewCoupon(ModelMap model,  @RequestParam double valuePln, @RequestParam Integer numberOfUses) {
		Coupon coupon =new Coupon(valuePln, numberOfUses);
		coupons.add(coupon);
		model.addAttribute("coupons", coupons);
		couponService.createNewCoupon(coupon);
		populateModel(model);
		return "add";
	}

	private void populateModel(ModelMap model) {
		model.addAttribute("coupons", couponService.findAllCoupons());
	}
}
