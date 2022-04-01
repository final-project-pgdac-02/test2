package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="order_details")
public class OrderDetail extends BaseEntity {
	
	@Range(min=1)
	@NotNull
	private int quantity;
	
	@Enumerated(EnumType.STRING)
	private ShippingStatus status;
	
	@Column(name = "effective_price")
	@Range(min=0)
	@NotNull
	private float effectivePrice;
	
	@Column(name = "shipping_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate shippingDate;

	public OrderDetail() {
		super();
	}
	
	{
		status=ShippingStatus.PENDING;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ShippingStatus getStatus() {
		return status;
	}

	public void setStatus(ShippingStatus status) {
		this.status = status;
	}

	public float getEffectivePrice() {
		return effectivePrice;
	}

	public void setEffectivePrice(float effectivePrice) {
		this.effectivePrice = effectivePrice;
	}

	public LocalDate getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(LocalDate shippingDate) {
		this.shippingDate = shippingDate;
	}

	@Override
	public String toString() {
		return "OrderDetail [quantity=" + quantity + ", status=" + status + ", effectivePrice=" + effectivePrice
				+ ", shippingDate=" + shippingDate + "]";
	}
	
	
}
