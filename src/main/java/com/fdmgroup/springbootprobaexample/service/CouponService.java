package com.fdmgroup.springbootprobaexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.springbootprobaexample.model.Coupon;
import com.fdmgroup.springbootprobaexample.model.User;
import com.fdmgroup.springbootprobaexample.repository.CouponRepository;


@Service
public class CouponService {

	@Autowired
	private CouponRepository repo;
	
	public List<Coupon> findAllCoupons(){
		return repo.findAll();
	}
	
	public void createNewCoupon(Coupon coupon) {
		repo.save(coupon);
	}
}
