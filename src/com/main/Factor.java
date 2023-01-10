package com.main;

public class Factor {
	
	 int factorial(int val) {
		if(val == 1 ) {
			return 1;
		}
		return factorial(val-1)*val;
	}
	
	public static void main(String args[]) {
		Factor fact = new Factor();
		System.out.println( fact.factorial(5));
	}
}
