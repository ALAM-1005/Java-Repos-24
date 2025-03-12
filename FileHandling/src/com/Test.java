package com;

import java.io.File;

public class Test {
	public static void main(String[] args) throws Exception {

		  //.txt,.doc,
		File f = new File("d:/car.pdf");
		
		System.out.println(f.createNewFile());
	}
}
