package com;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		int a[]= {10,20,30};
		  for(int i= 0;i<a.length;i++) {
			  
			  System.out.println(a[i]);
			 
		  }
		  
		  
		  
		  System.out.println("-------------------");
		  
		  
           for(int i= a.length-1;i>=0;i--) {    // reverse condition
			  
			  System.out.println(a[i]);
		  }
           System.out.println("-------------------");
		  
		  
		String [] Fruits = {"Apple","Banana","Mango"};
		  
		  for(int i=0; i<Fruits.length;i++) {
			  
			  
			  System.out.println(Fruits[i]);
			  
		  }
		  
		  
		  System.out.println("-------------------");
		  
		  
          for(int i= Fruits.length-1; i>=0; i--) {   // reverse condition
			  
			  System.out.println(Fruits[i]);
		  }
	}

}


// i<3   --> hard coding (bad practice)
// i<a.length  --> godd practice
