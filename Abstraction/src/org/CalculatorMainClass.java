package org;
import java.util.*;
public class CalculatorMainClass {

	public static void main(String[] args) {

		System.out.println("Welcome to the Calculator Project ");
		Scanner scan = new Scanner(System.in);
		Calculator clc = new CalculatorImpl();


		while(true) { // infinite loop

			//menu Driven program
			System.out.println("1:Additon \n2:Substraction  \n3:Multiplication \n4:Division \n5:Exit");

			System.out.println("Enter the choice");

			int choice = scan.nextInt();

			/**
			 * a and b local variable and local variable do not have default value.
			 * 
			 * therefore intializaltion it to zero
			 * */

			int a =0;
			int b =0;
			//Accepting only two numbers when choice is 1 2 3 4

			if(choice >=1 && choice<=4) {

				System.out.println("enter the two Numbers");
				a = scan.nextInt();
				b = scan.nextInt();
			}

			switch(choice) {

			case 1:
				clc.add(a,b);
				break;

			case 2:
				clc.sub(a, b);
				break;
			case 3:
				clc.mul(a, b);
				break;
			case 4:
				clc.div(a, b);
				break;
			case 5 :
				System.out.println("Thanks exit Successfully");
				System.exit(5); //terminate the program

			default:
				System.out.println("Envalid data");
			}
			
			System.out.println("----------------------------");
		}


	}

}
