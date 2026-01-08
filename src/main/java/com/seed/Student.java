package com.seed;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Student {
	@Id
	private int sid;
	@Column(name="Name", length=9)
	private String name;
	@Column(name="City", length=9)
	private String city;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, String city) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID :"+sid+" "+"Name :"+name+" "+"City :"+city;
	}
}
