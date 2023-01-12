package collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Comparator;

class StringLengthComprator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int s1length = s1.length();
		int s2length = s2.length();
		if(s1length > s2length) {
		    return -1;
		}
		if(s1length < s2length) {
			return 1;
		}
		return 0;
	}
	
}


public class SortingPractice {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("Animal");
		list.add("dog");
		list.add("mouse");
		
		Collections.sort(list, new StringLengthComprator());
		System.out.println(list);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(3);
		nums.add(2);
		nums.add(23);
		nums.add(14);
		
		Collections.sort(nums);
		System.out.println(nums);

	}

}
