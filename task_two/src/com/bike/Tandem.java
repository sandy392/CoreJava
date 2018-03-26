package com.bike;
public class Tandem extends Bike {
	
	String frontSeatColor;
	String backSeatColor;
	public Tandem(float currentSpeed, int cadence, int currentGear, String frontSeatColor, String backSeatColor) {
		super(currentSpeed, cadence, currentGear);
		this.frontSeatColor = frontSeatColor;
		this.backSeatColor = backSeatColor;
	}
	
	public void changeFrontSeat(String frontSeatColor) {
		
		this.frontSeatColor = frontSeatColor;
	}
	
	public void changeBackSeat(String backSeatColor) {
		this.backSeatColor = backSeatColor;
	}
	
	public void printTandemBike() {
		
		System.out.println("Front Seat Color :"+frontSeatColor);
		System.out.println("Back Seat Color :"+backSeatColor);
	}
	
	public static void main(String[] args) {
		
		Tandem tandem= new Tandem(20, 2, 2,"Pink","Blue");
		tandem.increaseSpeed(400);
		tandem.printDetails();
		tandem.changeBackSeat("Black");
		tandem.printTandemBike();
		
	}
}