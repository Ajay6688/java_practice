package com.main;

class Person {
	
	String name ;
	int age ;
	
	Person(){
		System.out.println("this is constructor with no arguments");
	}
	
	Person(String name , int age){
		this.name = name ;
		this.age  = age;
	}
	
	void about() {
		System.out.println("my name is "+name+" and age is "+age);
	}
	
}

public class ConstructorPractice {

	public static void main(String[] args) {
		Person ajay1 = new Person();
		Person ajay  =  new Person("Ajay" , 22);
		ajay.about();
		
	}

}
