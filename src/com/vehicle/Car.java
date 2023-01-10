package com.vehicle;
import com.main.ClassBInheritance;

public class Car {

	public static void main(String[] args) {
		ClassBInheritance cr = new ClassBInheritance();
		cr.hello();
		
		String info  = cr.infoOfVehicle(4, "black", 60);
		System.out.println(info);
	}

}
