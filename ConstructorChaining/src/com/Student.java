package com;

class Student {

	Student(int age) {
		this(5.6);
		System.out.println("age:"+age);
	}
	Student(String name){
		this(24);
		System.out.println("Name:"+name);

	}
	Student(double height){
		System.out.println("Heigth:"+height);
	}

	public static void main(String[] args) {
		Student s = new Student("tom");
	}


}
