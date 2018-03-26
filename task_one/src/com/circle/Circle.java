package com.circle;

public class Circle {
	
	private double radius;
	private double area;
	private double perimeter;
	
	
	//default constructor
	//it sets the variables to default values
	public Circle() {
		radius=2.0;
		
	}

	//Parametrised constructor
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	//method to calculate area of the circle
	public double calculateArea() {
		return radius*radius*Math.PI;
	}
	
	
	//method to calculate perimeter of the circle
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	

}
