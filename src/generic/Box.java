package generic;

public class Box<T> {
	T container ;
    
	Box(T cont){
		this.container = cont;
	}
	
	void doWork (){
		if(container instanceof String) {
			System.out.println("the type of container is string");
		}
		else if(container instanceof Integer) {
			System.out.println("the type of container is integer");
		}
	}
	
	
}
