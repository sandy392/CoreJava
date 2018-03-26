package com.bike;

	public class MountainBike extends Bike{

		int currentChainring;	
		
		//parameterized constructor 
		public MountainBike(float currentSpeed, int cadence, int currentGear, int currentChainring) {
			super(currentSpeed, cadence, currentGear);
			this.currentChainring = currentChainring;
		}
		
		public void changeChainring(int currentChainring) {
			
			this.currentChainring = currentChainring;
		}
		
		public void printMountainBike() {
			
			System.out.println("Current ChainRing :"+currentChainring);		
		}
		
		//main method
		public static void main(String[] args) {
			
			MountainBike bike= new MountainBike(10, 3, 1, 1);
			bike.increaseSpeed(550);
			bike.printDetails();
			bike.printMountainBike();
			
		}
	}

