package com;

public class Solution {
	
	
	static void display(Vehicle obj) {
		
		if(obj instanceof Car) {
			
			Car c = (Car) obj;
			
			System.out.println(c.brand);
			c.drive();
		}
		
		else if(obj instanceof Bike )
		{
			
			Bike b = (Bike) obj;
			
			System.out.println(b.brand);
			
			b.ride();
		}
		
	}
	
	public static void main(String[] args) {
		
		display(new Car());
		
		System.out.println("------");
		
		display(new Bike());
	}

}
