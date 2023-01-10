package com.main;

public class StringBuilderAndFormatter {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		str.append("hello ");
		str.append("how ");
		str.append("are ");
		str.append("you");
		
		System.out.println(str.toString());
		
		// in string formating we use \t for tab , \n for new line and printf method 
		
		System.out.println("hello this is a demo text . \t this is a tab \nwe are in new line ");
		System.out.printf("hello my age is : %d ",22);
		
		for(int i = 0 ; i<15 ; i++) {
			System.out.printf("%2d: hello everyone\n" , i);
		}
		
		// the meaning of 6.2 is 6 spaces form front to the end of the number in this case that is 6 
		// and 2 values after decimal also it rounds the values after decimal
		
		System.out.printf("%6.2f this is decimal values formating" ,4.35632 );
	}

}
