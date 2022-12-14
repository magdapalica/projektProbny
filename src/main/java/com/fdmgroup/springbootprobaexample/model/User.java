package com.fdmgroup.springbootprobaexample.model;



import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Integer id;
	private String firstName;
	private String lastName;
	private double totalPrice;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Coupon> coupons;

	public User() {};
	
	public User(String firstName, String lastName, double totalPrice) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalPrice = totalPrice;
	}



	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public double getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	public List<Coupon> getCoupons() {
		return coupons;
	}



	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}



	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, totalPrice);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice);
	}








	
}