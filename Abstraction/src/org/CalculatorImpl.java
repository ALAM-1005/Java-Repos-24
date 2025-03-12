package org;

public class CalculatorImpl implements Calculator {

	@Override

	public void add(int a,int b) {
		int sum  = a+b;
		System.out.println("Sum of "+a+" and "+b+" "+ sum);
	}

	@Override
	public void sub(int a,int b) {
		int sub = a-b;
		System.out.println("Substraction  of "+ a+" and "+b+" "+ sub);
	}


	@Override
	public void mul(int a,int b) {
		int mul = a*b;
		System.out.println("Mul of "+a+"  and "+b+" is "+ mul);
	}

	@Override
	public void div(int a,int b) {
		int div = a/b;
		System.out.println("Division of "+ a+" and "+b + " is "+div);
	}





}
