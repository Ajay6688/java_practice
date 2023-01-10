package com.main;

class Greetings{
	public void sayHello() {
		System.out.println("hello");
	}
}

class Ind{
	Greetings g=new Greetings() {
		public void sayHello() {
			System.out.println("vandanalu");
		}
	};
}



public class Anonymous {

	public static void main(String[] args) {
		Ind ind = new Ind();
		ind.g.sayHello();
	}

}
