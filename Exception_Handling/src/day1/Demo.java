package day1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Start");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Two number");

		int a = sc.nextInt();

		int b = sc.nextInt();
		sc.close();
		try {
			System.out.println(a/b);

		}catch(ArithmeticException e) {

			System.out.println("do not divided by Zero");
		}


	}
}
