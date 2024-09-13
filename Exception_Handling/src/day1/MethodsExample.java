package day1;

public class MethodsExample {
	
	public static void main(String[] args) {
		
		
System.out.println("Start");
		
		int[]a = {10,20,30};
		
		try {
			
			System.out.println(a[100]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println(e.getMessage()); // using this methods for print the exception message
//			
			e.printStackTrace();
			System.out.println("Invalid Index Position");
		}
		
		System.out.println("End");
	}

}
