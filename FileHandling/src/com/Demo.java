package com;
import java.io.*;


public class Demo {
	
	
	public static void main(String[] args) {

		//object representation of a file name or folder name
		// since path is not Specifies ,folder jgets created inside the project
		//File f = new File("Car");


		// folder gets created Within e drive
		File f = new File("student");

		boolean result = f.mkdir();  // after creting a folder ,it returns true or false

		System.out.println(result);//System.out.println(f.mkdir());
	}
}


// directory -> folder-> package