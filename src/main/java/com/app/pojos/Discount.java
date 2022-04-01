package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "discounts")
public class Discount extends BaseEntity {

	@Range(min=0)
	@Column(precision = 2)
	@NotNull
	private float discountPercent;
	
	@Range(min=1,max=5)
	private int exclusivity;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@FutureOrPresent
	@NotNull
	private LocalDate startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@FutureOrPresent
	@NotNull
	private LocalDate endDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	
	{
		
		isActive=false;
		exclusivity=MembershipType.values().length;
	}
	

	public Discount() {
		super();
	}

	public float getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(float discountPercent) {
		this.discountPercent = discountPercent;
	}

	public int getExclusivity() {
		return exclusivity;
	}

	public void setExclusivity(int exclusivity) {
		this.exclusivity = exclusivity;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Discount [discountPercent=" + discountPercent + ", exclusivity=" + exclusivity + ", startDate="
				+ startDate + ", endDate=" + endDate + ", isActive=" + isActive + "]";
	}
	
	
}
