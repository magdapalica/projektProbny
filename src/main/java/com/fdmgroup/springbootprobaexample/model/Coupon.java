package com.fdmgroup.springbootprobaexample.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity
	public class Coupon {
		
		@Id
		@GeneratedValue
		@Column(name = "coupon_id")
		private Integer id;
		
		public Coupon() {};
		
		private double valuePln;
		private Integer numberOfUses;

		public Coupon(double valuePln, Integer numberOfUses) {
			super();
			this.valuePln = valuePln;
			this.numberOfUses = numberOfUses;
		}

		public Integer getId() {
			return id;
		}

		public double getValuePln() {
			return valuePln;
		}

		public void setValuePln(double valuePln) {
			this.valuePln = valuePln;
		}

		public Integer getNumberOfUses() {
			return numberOfUses;
		}

		public void setNumberOfUses(Integer numberOfUses) {
			this.numberOfUses = numberOfUses;
		}

		@Override
		public int hashCode() {
			return Objects.hash(numberOfUses, valuePln);
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
			return Objects.equals(numberOfUses, other.numberOfUses)
					&& Double.doubleToLongBits(valuePln) == Double.doubleToLongBits(other.valuePln);
		}

		
		



	

}
