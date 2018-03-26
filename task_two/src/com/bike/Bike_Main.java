package com.bike;

public class Bike_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike(0.0f,2,5);
		bike.applyBrakes(26f);
		//bike.increaseSpeed(2);
		bike.changeGear(-1);
		bike.printDetails();
	}

}
