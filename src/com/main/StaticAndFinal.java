package com.main;

class Man{
	static final String name = "Ajay";
	static int age = 22 ;
	
	static int i = 0;
	void iterate() {
		System.out.println(i++);
	}
}

public class StaticAndFinal {
	public static void main(String args[]) {
		System.out.println( "my name is "+Man.name+ " and my age is "+Man.age );
		Man aj = new Man();
		Man aj2 = new Man();
		Man aj3 = new Man();
		aj.iterate();
		aj2.iterate();
		aj3.iterate();
	}
}
