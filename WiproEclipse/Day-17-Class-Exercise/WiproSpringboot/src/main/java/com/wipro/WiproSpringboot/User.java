package com.wipro.WiproSpringboot;

public class User {

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", eid=" + eid + ", salary=" + salary + "]";
	}
	public User() {
		super();
	}
	public User(String name, String password, String eid, int salary) {
		super();
		this.name = name;
		this.password = password;
		this.eid = eid;
		this.salary = salary;
	}
	String name,  password, eid;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
