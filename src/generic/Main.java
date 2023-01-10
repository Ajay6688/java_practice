package generic;

public class Main {

	public static void main(String[] args) {
		Box<String> box = new Box<String>("fghj");
		box.doWork();
		
		Box<Integer> box1 = new Box<Integer>(23);
		box1.doWork();
	}

}
