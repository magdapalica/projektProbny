package com.fdmgroup.springbootprobaexample.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity
	@Table(name = "USERS_ID")
	public class Coupon {
		@Id
		@GeneratedValue
		@Column(name = "USER_ID")
		private Integer id;
		private double valuePln;
		private int numberOfUses;
		
		
		public Coupon(Integer id, double valuePln, int numberOfUses) {
			super();
			this.id = id;
			this.valuePln = valuePln;
			this.numberOfUses = numberOfUses;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public double getValuePln() {
			return valuePln;
		}


		public void setValuePln(double valuePln) {
			this.valuePln = valuePln;
		}


		public int getNumberOfUses() {
			return numberOfUses;
		}


		public void setNumberOfUses(int numberOfUses) {
			this.numberOfUses = numberOfUses;
		}


		@Override
		public int hashCode() {
			return Objects.hash(id, numberOfUses, valuePln);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Coupon other = (Coupon) obj;
			return Objects.equals(id, other.id) && numberOfUses == other.numberOfUses
					&& Double.doubleToLongBits(valuePln) == Double.doubleToLongBits(other.valuePln);
		}
		

}
