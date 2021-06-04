package com.cg.day14.anonynmous;

public class Anonymous {

	public static void main(String[] args) {
		
		Shape shape = new Shape() {
			
			@Override
			void area() {
				System.out.println("Length = "+length+" units");
				System.out.println("Here's the area..."+length*length+" sq units");
			}
		};
		
		shape.area();
		
		Vehicle vehicle = new Vehicle() {
			
			@Override
			public void costOfVehicle() {
				System.out.println("Cost of the vehicle");
			}
			
			@Override
			public void typeOfVehicle() {
				System.out.println("Type of vehicle");
			}
		};
		
		vehicle.costOfVehicle();
		vehicle.typeOfVehicle();
	}
}