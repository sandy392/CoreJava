package com.employee;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String employementType;
	static String companyName="TCS";
	
	public Employee() {
		
	}
	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public static String getCompany() {
		return companyName;
	}

	public void employeeDetails() {
		System.out.println("Employee with ID:"+ id + " & Name:"+ firstName+" "+ lastName+" works for company " + companyName );
	}
	
	public void employeeDetails(String employementType) {
		System.out.println("Employee with ID:"+ id + " & Name:"+ firstName+" "+ lastName+" works " + employementType + " for company "+companyName);
	}
	
	
}
