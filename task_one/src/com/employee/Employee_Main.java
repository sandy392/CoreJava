package com.employee;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		System.out.println("Company Name:"+emp1.getCompany());
		Employee emp2=new Employee(123, "James", "Smith");
		emp2.employeeDetails();
		Employee emp3=new Employee(345, "Robert", "Johnson");
		emp3.employeeDetails("Fulltime");
		
	}

}
