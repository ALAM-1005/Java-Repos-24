package nonprimitivecasting;

public class MainClass {

	public static void main(String[] args) {
		// upcasting
		Vehicle v = new Car();

		System.out.println(v.brand);

		v.start();
		
		System.out.println("---------------");
		
		//Downcasting
		
		Car c = (Car) v;
		
		System.out.println(c.brand);
		System.out.println(c.fuel);
		
		c.drive();
		c.start();
	}
}
