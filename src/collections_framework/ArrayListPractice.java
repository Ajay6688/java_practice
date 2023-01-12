package collections_framework;

import java.util.ArrayList;

public class ArrayListPractice {
	
	void traverse(ArrayList<Integer> numbers) {
		for(int i = 0 ; i< numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}

	public static void main(String[] args) {
		
		ArrayListPractice al = new ArrayListPractice();
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		
//		first type of traversal 
		for(int i = 0 ; i< numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
//		second type of traversal
		System.out.println();
		for(Integer num : numbers) {
			System.out.println(num);
		}
		
//		removing last element
		System.out.println("removing last element ");
		
		numbers.remove(numbers.size() -1);
		al.traverse(numbers);
		
//		removing first element 
		System.out.println("removing first element");
		
		numbers.remove(0);
		al.traverse(numbers);
		
		
	}

}
