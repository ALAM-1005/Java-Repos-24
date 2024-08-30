package org;

public class Employee {

	int id;//100
	String name;//null
	double salary;//0.0


	Employee(int id){
		this.id=id;
	}
	Employee(int id,String name){
		this(id);
		this.name=name;
	}
	Employee(int id,String name,double salary){
		this(id,name);
		this.salary=salary;
	}

	public static void main(String[] args) {


		Employee emp = new Employee(100);
		Employee emp2 = new Employee(1001,"tom",200.0);

		System.out.println("ID:"+emp.id+"  Name is :"+emp.name+" Salary is  :"+emp.salary);
	}

}
