package com.app.pojos;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "books")
public class Book extends BaseEntity {
	
	
	@Column(name="book_title", length = 100, nullable = false)
	private String bookTitle;
	
	@Column(length=100, nullable=false)
	private String author;
	
	@Column(length=100, nullable=false)
	private String publication;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull
	private Category category;
	
	@Column(name="book_cover")
	@Lob
	private byte[] bookCover;
	
	@Range(min=0, message="Stock cannot be negative")
	private int stock;
	
	@Range(min=1, max=5, message="Rating must be between 1 and 5")
	private float rating;
	
	@Range(min=1,message="Price cannot be negative")
	private float price;
	
	@Column(name="isbn")
	@Length(min=13, max=13)
	private String isbn;
	
	
	public Book() {
		super();
	}
	
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public byte[] getBookCover() {
		return bookCover;
	}
	public void setBookCover(byte[] bookCover) {
		this.bookCover = bookCover;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", author=" + author + ", publication=" + publication + ", category="
				+ category + ", bookCover=" + Arrays.toString(bookCover) + ", stock=" + stock + ", rating=" + rating
				+ ", price=" + price + ", isbn=" + isbn + "]";
	}
	
	
	
}
