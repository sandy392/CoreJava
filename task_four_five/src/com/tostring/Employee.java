package com.tostring;

public class Employee {
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee() {}
	@Override
	public String toString() {
		return String.format("Employee [firstName=%s, lastName=%s]", firstName, lastName);
	}
	
	
	

}
