package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class User extends BaseEntity {

	@Column(name="first_name", length=50, nullable = false)
	@NotBlank
	private String firstName;
	
	@Column(name="last_name", length=50, nullable=false)
	@NotBlank
	private String lastName;
	
	@Email
	@Column(length=50, unique = true, nullable = false)
	@NotBlank
	private String email;
	
	@Column(length=50, nullable = false)
	@NotBlank
	private String password;
	
	@Column(length=10)
	@NotBlank
	private String phone;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	@Column(nullable = false)
	private Role role;
	
	@Column(name="membership_type")
	@Enumerated(EnumType.STRING)
	private MembershipType membershipType;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	List<Address> addresses=new ArrayList<>();

	
	public User() {
		super();
	}
	
	{
		membershipType=MembershipType.REGULAR;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public MembershipType getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(MembershipType membershipType) {
		this.membershipType = membershipType;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + ", role=" + role + ", membershipType=" + membershipType + "]";
	}
	
	
}
