package com.main;

class Arithmetics {
	int a  = 2 , b =5 ;
	
	void add () {
		System.out.println(a+b);
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		Arithmetics calc = new Arithmetics();
		calc.add();
		System.out.println(calc.a);
		System.out.println(calc.b);
	}

}
