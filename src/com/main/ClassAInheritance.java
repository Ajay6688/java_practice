package com.main;

class Car extends Vehicle{
	
}

class Bike extends Vehicle{
	
}

public class ClassAInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we can make the obj of a class in any other class that is in other file also but in name package
		ClassBInheritance obj  =new ClassBInheritance();
		obj.hello();
		
		// creating the object of the car class that extends vehicle class
		Car car = new Car();
//		car.start();
		String info  = car.infoOfVehicle(4, "black", 25);
		System.out.println(info);
		
		// creating the object of the Bike class that extends vehicle class
		Bike bike = new Bike();
//		bike.start();
		String bikeInfo =  bike.infoOfVehicle(2 , "silver" , 55);
		System.out.println(bikeInfo);
		
	}

}
