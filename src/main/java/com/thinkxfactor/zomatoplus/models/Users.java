package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tbl_user")
public class Users implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="name",unique=true)
	private String name;
	
	@Column(name="pwd")
	private String pwd;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="star")
	private int star;

	
	
	
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(long id, String name, String pwd, String email, String phone, int star) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
		this.star = star;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
	
	
	
	}
