package call_by_value;

public class Person {
	int age = 21;
	
    void changePersonAge(Person person) {
    	System.out.println("before changing mona age : "+person.age);
		person.age = 22;
	}
}
