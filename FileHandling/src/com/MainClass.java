package com;

import java.io.File;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {

		//1. Creating file object and Specifies file name
		File f = new File("car.pdf");

		// 2.lastModified() returns millisecond value
		long millisecond = f.lastModified();

		//3. converting millisecond to date format
		Date d = new Date(f.lastModified());


		//4. printing the reference variable because toString() overridden in date class
		System.out.println(d);

		//5. printing in two lines
		Date d1 = new Date(f.lastModified());
		System.out.println(d1);


		//6. printing in single lines
		System.out.println(new Date(new File("car.pdf").lastModified()));

	}

}
