package collections_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap<Integer , String> hm = new HashMap<Integer , String>();
		hm.put(1, "one");
		hm.put(2 , "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		
		System.out.println(hm.get(4));
		
		// traverse of hash map
		
		System.out.println("traverse of Hash Map");
		for(Map.Entry<Integer , String> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
	}

}
