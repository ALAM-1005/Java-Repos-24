package org;

import java.util.Scanner;

public class Demo {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//infinite loop

		while(true) {

			System.out.println("Enter the Choice");
			int choice  = scan.nextInt();

			switch(choice) {

			case 1:
				System.out.println("Hii");
				break;
			case 2:
				System.out.println("bye");
				break;
			case 3:
				System.out.println("Thank u !!!");
				System.exit(0);
			default:
				System.out.println("Invalid data ");

			}//
			
			System.out.println("--------------");
		}


	}
}
