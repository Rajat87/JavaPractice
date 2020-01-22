package com.practicejdbc;

public class Employee {
	private int eid;
	private String name;
	private int age;
	private String email;
	private String address;
	
	public Employee(int eid, String name, int age, String email, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	

	int getEid() {
		return eid;
	}



	String getName() {
		return name;
	}



	int getAge() {
		return age;
	}



	String getEmail() {
		return email;
	}



	String getAddress() {
		return address;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", email=" + email + ", address=" + address
				+ "]";
	}
	
	
}
