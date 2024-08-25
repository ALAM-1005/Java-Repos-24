package com;

public class Runner {

	/* Generalization or Upcasting
	 
	 1. if dispaly (new Son());   ---> Father obj = new Son();

	 2. if Display (new Daughter()); --> father obj = new  Daughter();

	 */
	static void display(Father obj) {

		if(obj instanceof Son) {

			System.out.println("DownCasting the son");
			Son S = (Son) obj;
			System.out.println("X = "+S.x+" y =  "+S.y);
		}
		else if(obj instanceof Daughter) {

			System.out.println("DownCasting the Daughter");

			Daughter D = (Daughter) obj;

			System.out.println("X = "+D.x+" Z =  "+D.z);
		}

	}
	public static void main(String[] args) {
		display(new Son());
		System.out.println("-----------");
		display(new Daughter());

	}



}
