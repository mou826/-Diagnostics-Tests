package com.diaStore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyTests")
public class MyTestList {
	@Id
	
	private int id;
	private String testname;
	private String doctorname;
	private String price;
	public MyTestList(int id, String testname, String doctorname, String price) {
		super();
		this.id = id;
		this.testname = testname;
		this.doctorname = doctorname;
		this.price = price;
	}
	public MyTestList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}
