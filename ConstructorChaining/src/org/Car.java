package org;

class Car {

	String brand;

	int price;

	Car(String brand){

		this.brand = brand;

	}
	Car(String brand,int price){

		this(brand);
		this.price = price;
	}

	public static void main(String[] args) {

		Car c = new Car("Suzuki",2000);
		System.out.println("car Brand is"+c.brand);
		System.out.println("Car cost is"+c.price);
	}

}
