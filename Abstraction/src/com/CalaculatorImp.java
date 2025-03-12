package com;

public class CalaculatorImp  implements Calculator{

	@Override

	public void add(int a,int b) { 

		int sum= a+b;
		System.out.println("Sum of "+a+" and "+ b+ " is : "+sum);
	}

	@Override
	public void mul(int a,int b) {

		int mul = a*b;
		System.out.println("Multiple of "+a+" and "+b+" is  : "+mul);


	}
	
	

}
