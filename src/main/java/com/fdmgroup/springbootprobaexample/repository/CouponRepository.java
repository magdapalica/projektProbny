package com.fdmgroup.springbootprobaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdmgroup.springbootprobaexample.model.Coupon;
import com.fdmgroup.springbootprobaexample.model.User;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}
