package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="tbl_restaurant")
public class Restaurant implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="restaurant_id")
	private long id;
	
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	
	@Column(name="website")
	private String website;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="description")
	private String description;
	
	@Column(name="city")
	private String city;
	
	@Column(name="rating")
	private String rating;

	
	
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Restaurant(long id, String name, String address, String email, String website, String contact,
			String description, String city, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.website = website;
		this.contact = contact;
		this.description = description;
		this.city = city;
		this.rating = rating;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	

}
