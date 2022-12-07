package com.fdmgroup.springbootprobaexample.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdmgroup.springbootprobaexample.model.Coupon;
import com.fdmgroup.springbootprobaexample.model.User;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {

//	@Autowired
//	private UserRepository repo;
//	
//	public List<Coupon> findAllCoupons(){
//		return repo.findAll();
//	}
}
