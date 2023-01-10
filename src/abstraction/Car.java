package abstraction;

public class Car extends Machine{
	public void run() {
		System.err.println("car is runnning ...");
	}
	public static void main(String[] args) {
		Car thar  = new Car();
		thar.run();
		thar.start();
	}
	

}
