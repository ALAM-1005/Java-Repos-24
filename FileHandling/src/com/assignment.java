package com;

import java.io.*;

public class assignment {


	public static void main(String[] args) throws Exception {
		
		
		File f = new File("festival.txt");
		
		FileWriter fw  = new FileWriter(f);
		
		fw.write("happy Dasara & kindly dont forget java");
		fw.flush();
		fw.close();
		
		System.out.println("data enterd successfully");
		
		
	}
	
}
