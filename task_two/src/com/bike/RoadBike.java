package com.bike;
public class RoadBike extends Bike {
	
	int HandleDropdownAngle;

	public RoadBike(float currentSpeed, int cadence, int currentGear, int handleDropdownAngle) {
		super(currentSpeed, cadence, currentGear);
		HandleDropdownAngle = handleDropdownAngle;
	}
	
	public void changeHandleDropdownAnge(int HandleDropdownAngle ) {
		
		this.HandleDropdownAngle = HandleDropdownAngle;
	}
	
	public void printRoadBikedetails() {
		
		System.out.println("Bike Handle Dropdown Angle:"+HandleDropdownAngle);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RoadBike roadBike= new RoadBike(30, 1, 1,55);
		roadBike.changeCandence(5);
		roadBike.increaseSpeed(430);
		roadBike.printDetails();	
		roadBike.printRoadBikedetails();
	}
}