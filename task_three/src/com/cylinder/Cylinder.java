package com.cylinder;

public class Cylinder extends Rectangle {
	private int height;
	
	public Cylinder() {	
	}
	
	public Cylinder(int height, double radius) {
		super(radius);
		this.height = height;
	}
	
	public double calculateArea(int height, double radius) {
		Circle base=new Circle();
		double baseArea = base.calculateArea(radius);
		Rectangle rect= new Rectangle();
		double rectArea= rect.calculateArea(radius);
		return (2*baseArea)+(rectArea*height); 
	}
	
}
