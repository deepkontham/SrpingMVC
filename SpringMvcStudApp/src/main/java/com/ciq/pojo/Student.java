package com.ciq.pojo;



public class Student {
	private int id;
	private String name;
	private String dob;
	private String city;

	public Student() {

	}

	public Student(int id, String name, String dob, String city) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.city = city;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", city=" + city + "]";
	}

}
