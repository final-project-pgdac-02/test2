package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="cards")
public class Card extends BaseEntity {
	
	@NotBlank
	@Column(name="card_holder_name", length = 100)
	private String cardHoldername;
	
	@Column(unique = true, nullable = false,length=16)
	@NotBlank
	@Length(min=16,max=16)
	private String cardNumber;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate expiryDate;
	
	

	public Card() {
		super();
	}

	public String getCardHoldername() {
		return cardHoldername;
	}

	public void setCardHoldername(String cardHoldername) {
		this.cardHoldername = cardHoldername;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Card [cardHoldername=" + cardHoldername + ", cardNumber=" + cardNumber + ", type=" + type
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	
	
	
}
