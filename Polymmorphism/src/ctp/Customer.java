package ctp;

public class Customer {
	
	static void display(OnlineShoppingApp obj) {
		
		obj.order();
	}

	public static void main(String[] args) {
		//1.upcasting using methods
		display(new Amazon());
		display(new Flipkart());
		display(new Myntra());


		System.out.println("---------------------");

		//2. upcasting using single reference variable

		OnlineShoppingApp osa1 = new Amazon();
		osa1.order();
		OnlineShoppingApp osa2 = new Flipkart();
		osa2.order();
		OnlineShoppingApp osa3 = new Myntra();
		osa3.order();



		System.out.println("---------------------");


		//3.upcasting using seprate reference variable

		OnlineShoppingApp osa;

		osa = new Amazon();
		osa.order();
		osa = new Flipkart();
		osa.order();
		osa = new Myntra();
		osa.order();
	}

}
