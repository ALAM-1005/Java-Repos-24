package Java_Basics;

public class Globalvar {

	int age;  //Global variable
	String name; // instance variable

	{
		int age = 20; // local variable
		String name = "Md juned alam";  // local variable
		System.out.println("Name is :"+name+" and Age is :"+age);

	}
	public static void main(String[] args) {
		Globalvar gv = new Globalvar();

	}

}
