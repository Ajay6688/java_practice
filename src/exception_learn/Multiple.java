package exception_learn;

import java.io.*;

public class Multiple{

	static void run () throws ArithmeticException , ArrayIndexOutOfBoundsException {
		if(true) { 
			throw new ArrayIndexOutOfBoundsException() ;
		}
		System.out.println("hii ");
	}

	 
	public static void main(String[] args) {
	    // we can catch multiple exceptions using multiple catch blocks 
		try {
			run();
		} catch (ArithmeticException e) {
			System.out.println("file not found");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound");
		}
	}

}
