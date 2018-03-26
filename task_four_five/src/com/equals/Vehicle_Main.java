package com.equals;

public class Vehicle_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle myCar = new Vehicle("Corolla",2012,"Toyota");
		 Vehicle minivan = new Vehicle ("Taurus",2014,"Ford");
		 Vehicle focus = new Vehicle("Corolla",2012,"Toyota");
		 	if (myCar.equals(minivan)) {
		 			System.out.println("This two vehicle objects are not equal");
		         }
		 	if (myCar.equals(focus)) {
		 			System.out.println("This two vehicle objects are equal");
		   }
	}

}
