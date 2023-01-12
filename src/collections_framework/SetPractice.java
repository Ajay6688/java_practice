package collections_framework;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		
		Set<String> st = new HashSet<String>();
		st.add("cat");
		st.add("dog");
		st.add("elephant");
		st.add("lion");
		st.add("cat");
		
		// traverse the set
		System.out.println("traversing set");
		for(String value : st) {
			System.out.println(value);
		}
		
		if(st.contains("lion")){
			System.out.println("set contains lion");
		}
		
	}

}
