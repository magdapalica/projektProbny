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




@Controller
public class CouponController {
	
	@Autowired
	private CouponService service;
	
	private List<Coupon> coupons = new ArrayList<Coupon>();

	@RequestMapping(method=RequestMethod.GET, value="/")
	@GetMapping( value="/")
	public String goToIndex(ModelMap model) {
		model.addAttribute("coupons", coupons);
		populateModel(model);
		return "index";
	}
//	
//	@PostMapping( value="/")
//	public String createNewPlace(ModelMap model, @RequestParam String city,  @RequestParam(name="country") String placeCountry) {
//		Place place=new Place(city, placeCountry);
////		places.add(place);
////		model.addAttribute("places", places);
//		service.createNewPlace(place);
//		populateModel(model);
//		return "index";
//	}
//	@GetMapping(value="/places/{id}")
//	public String goToDetails(ModelMap model, @PathVariable int id) {
//		model.addAttribute("place", service.findPlacebyId(id));
//		return "details";
//	}
//	
//	@PostMapping(value="/deletePlace")
//	public String deletePlace(ModelMap model, @RequestParam int id) {
//		service.deletePlace(id);
//		populateModel(model);
//		return "index";
//	}
	private void populateModel(ModelMap model) {
		model.addAttribute("places", service.findAllCoupons());
	}
}
