package collections_framework;

import java.util.LinkedList;

public class LinkedListPractice {
	
	void traverse(LinkedList<Integer> nums) {
		for(Integer i : nums) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		// traverse of linked list
		LinkedListPractice llp = new LinkedListPractice();
		llp.traverse(numbers);
		
		// remove last element 
		System.out.println("after removing last element");
		numbers.remove( numbers.size() - 1 );
		llp.traverse(numbers);
		
		System.out.println("after removing first element");
		numbers.remove(0);
		llp.traverse(numbers);
	}

}
