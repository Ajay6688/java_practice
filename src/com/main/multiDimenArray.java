package com.main;

public class multiDimenArray {

	public static void main(String[] args) {
		int grid[][] = {
				{1 , 2},
				{3 , 4}
		};
		
		System.out.print(grid[0][1]);
		System.out.println();
		for(int i = 0 ; i<2 ; i++) {
			for( int j = 0 ; j < 2 ; j++) {
				System.out.print(grid[i][j]);
			}
		}
		
		
	}

}
