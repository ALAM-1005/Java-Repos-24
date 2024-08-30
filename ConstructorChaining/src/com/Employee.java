package com;

public class Employee {
	Employee(String name,int age){
		this(2.8);
		System.out.println("Name:"+name+"   "+"Age: "+age);

	}
	Employee(int id){

		System.out.println("ID:"+id);

	}
	Employee(double salary){
		this(100);
		System.out.println("salary:"+salary+" CR.");

	}

	public static void main(String[] args) {

		Employee e = new Employee("Tom",22);

	}
}
