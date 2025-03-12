package com;

import java.io.File;

public class Example {
	public static void main(String[] args) {

		File f1 = new File("student");
		File f2 = new File("employee");
		
		System.out.println(f1.renameTo(f2));
	}
}
