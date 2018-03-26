package com.cylinder;

public class Circle {
	protected double radius;
	
	public Circle() {}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	 public double calculateArea(double radius) {
		 return radius*radius*Math.PI;
	 }
	

}
