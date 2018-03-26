package com.circle;

public class Circle_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1= new Circle();
			System.out.println("Using default constructor===>");
			System.out.println("Area of the circle:" + c1.calculateArea());
			System.out.println("Perimeter of the triangle:"+c1.calculatePerimeter());
	
		Circle c2= new Circle(4.5);
			System.out.println("Using parameterised constructor===>");
			System.out.println("Area of the circle: " + c2.calculateArea());
			System.out.println("Perimeter of the triangle:"+c2.calculatePerimeter());
}
	
}	
