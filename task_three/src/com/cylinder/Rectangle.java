package com.cylinder;

public class Rectangle extends Circle {
	
	public Rectangle() {}

	public Rectangle(double radius) {
		super(radius);
	}
	
	public double calculateArea(double radius) {
		return 2*Math.PI*radius;
	}
	
	

}
