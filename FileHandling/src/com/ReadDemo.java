package com;

import java.io.*;

public class ReadDemo {

	
	public static void main(String[] args) throws Exception{
		
		
		File f = new File("Student.txt");
		
		FileReader fr = new FileReader(f); 
		
		int x = fr.read();
		
		while(x!= -1) {
			
			System.out.print((char)x);
			
			x = fr.read();
		}
		
		fr.close();
	}
}
