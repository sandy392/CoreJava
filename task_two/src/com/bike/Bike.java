package com.bike;

public class Bike {
	float currentSpeed;
	int cadence;
	int currentGear;
	
	public Bike() {
		
	}

	public Bike(float currentSpeed, int cadence, int currentGear) {
		super();
		this.currentSpeed = currentSpeed;
		this.cadence = cadence;
		this.currentGear = currentGear;
	}

	public void changeCandence(int cadence ) {
		this.cadence = cadence;
	}
	
	public void changeGear(int currentGear) {
		 if(currentGear < 0) {
			 System.out.println("Increase the gear to start the bike");
			 this.currentGear = currentGear;
		 } else {
			 this.currentGear = currentGear;
		 }
	}
	
	public void increaseSpeed(float currentSpeed) {
		this.currentSpeed = this.currentSpeed + currentSpeed;
	}
	
	public void applyBrakes(float decrement ) {
		this.currentSpeed = this.currentSpeed - decrement;
	}
	
	public void printDetails() {
		System.out.println("Current Speed :"+currentSpeed);
		System.out.println("Current Gear :"+currentGear);
		System.out.println("Current Cadence :"+cadence);
	}
	

}
