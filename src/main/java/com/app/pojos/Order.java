package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="orders")
public class Order extends BaseEntity {
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@FutureOrPresent
	@NotNull
	private LocalDate orderDate;
	
	@Range(min=0)
	@Column(precision = 2)
	private float orderTotal;

	public Order() {
		super();
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public float getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(float orderTotal) {
		this.orderTotal = orderTotal;
	}

	@Override
	public String toString() {
		return "Order [orderDate=" + orderDate + ", orderTotal=" + orderTotal + "]";
	}
	
	
}
