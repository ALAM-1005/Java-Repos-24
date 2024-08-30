package org;

class Student {
	int age ;
	String name;

	Student(int age) {

		this.age = age;

	}

	Student(int age,String name)
	{
		this(age);  //this.age = age;
		this.name=name;
	}

	public static void main(String[] args) {

		Student s =  new Student(20,"tom");

		System.out.println("Age:"+s.age);


		System.out.println("Name :"+s.name);

	}

}
