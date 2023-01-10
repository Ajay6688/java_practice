package com.main;

class Machine{
	class Car {
		 void sayHello() {
			System.out.println("hello by the car ...");
		}
	}
	
	static class Bike{
		void sayHello(){
			System.out.println("hello by the bike ...");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		
		Machine mc = new Machine();
		Machine.Car car = mc.new Car();
		car.sayHello();
		
		Machine.Bike bk = new Machine.Bike();
		bk.sayHello();
		
		
	}

}
