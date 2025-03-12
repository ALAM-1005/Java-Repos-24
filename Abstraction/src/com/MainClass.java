package com;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);

		System.out.println("Enter the two numbers");
		int a = scan.nextInt();	

		int b =scan.nextInt();
		Calculator clc = new CalaculatorImp(); // rule


		clc.add(a, b);  // press ctlr and going to cursor on methods name then click and achieve abstraction

		clc.mul(a, b);

		scan.close();
	}

}
