package Java_Assignment;

public class Car implements Comparable<Car>{
	
	Integer cost;
	String name;
	public Car(Integer cost, String name) {
		this.cost = cost;
		this.name = name;
	}
	@Override  // becouse it returns String representation of an object
	
	public String toString() {
		
		return cost+" needs to buy "+name+" car";
	}
	
	@Override  // its returns integer value so thats we calls wrapper class
	 
	 public int compareTo(Car c) {
		
		return this.cost.compareTo(c.cost);
	}
	
	
  
}
