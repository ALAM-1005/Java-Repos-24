package com;

import java.io.File;
import java.io.FileWriter;

public class WriteDemo {
	public static void main(String[] args) throws Exception {

		File f = new File("Student.txt");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("Hello");  // converting data into Streams
		fw.flush(); // coverting  Streams(Set of Binary Values) into data
		fw.close();
		
		System.out.println("Data written");
		
	}
}
