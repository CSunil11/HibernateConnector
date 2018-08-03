package com.hiber;

public class Users {
	
	int id=0;
	String name ="";
	String surname ="";
	int phone;
	String add ="";
	String join_date ="";
	
	public Users(String name, String surname, int i, String add, String joindate) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.surname=surname;
		this.phone=i;
		this.add=add;
		this.join_date=joindate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getJoin_date() {
		return join_date;
	}
	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
}
