package com;

public class Demo {

	
public static void main(String[] args) {
	
	// array declaration
	
	int[] a;
	
	// Array creation
	
	a = new int[3];
	
	// printing  array element
	
	System.out.println(a[0]);
	
	System.out.println(a[1]);
	
	System.out.println(a[2]);
	
	
	System.out.println("-------------------------------------------");
	
	// array initialization
	
	
	a[0] = 100;
	
	a[2] = 200;
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println("length of  array "+a.length);
	// array creation and initialization
	
	double [] x = new double[2];
	
	System.out.println(x[0]);
	
	System.out.println(x[1]);
	
	System.out.println("length of  array "+x.length);
	
	x[0] = 10.01;
	x[1] = 12.02;
	
	System.out.println(x[0]);
	
	System.out.println(x[1]);
	
	
	
	
}

}
