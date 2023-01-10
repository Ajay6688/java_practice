package call_by_value;

public class CallByValue {
	
	void changeTheValue(int val) {
		val = 20;
		System.out.println("after changing val : "+val);
	}

	public static void main(String args[]) {
		int val = 10;
		System.out.println("before calling chageTheValue : "+val);
		
		CallByValue cby = new CallByValue();
		cby.changeTheValue(val);
		
		System.out.println("after call ends : "+val);
		
//		-----------------------------------------------------------
		
		Person mona = new Person();
		
		System.out.println("before calling func : "+mona.age);
		mona.changePersonAge(mona);
		System.out.println("after call ends "+mona.age);
		
	}
}
