package com.main;


class Vehicle {
    
    public String start() {
    	return "the vehicle started ";
    }
    
    public String infoOfVehicle(int nTyres , String color , float avr ) {
    	return "This vehicle has "+nTyres+" tyres \nThe color of the vehicle is "+color+"\nThe average of the vehicle is "+avr;
    }
}

public class ClassBInheritance extends Vehicle {

	public void hello () {
		System.out.println("hello my name is Ajay");
	}

}
