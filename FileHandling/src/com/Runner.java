package com;

import java.io.File;

public class Runner {
	public static void main(String[] args) {

		
		File f = new File("Sar.txt");
		
		if(f.exists()) {
			
			f.delete();
			System.out.println("File/Folder is deleted");
		}
		
		else {
			
			System.out.println("File/Folder is not Found");
		}
	}
}
