package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "feedbacks")
public class Feedback extends BaseEntity {

	@Range(min=1,max=5, message = "Rating should be between 1 and 5!")
	private float rating;
	
	@Column(length = 500)
	private String review;

	public Feedback() {
		super();
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
	
}
