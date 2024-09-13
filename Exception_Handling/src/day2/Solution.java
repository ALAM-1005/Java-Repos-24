package day2;

public class Solution {
	public static void main(String[] args) {
		
		try {
			
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Not divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Not divided by zero");
		}
		catch(Exception e) {
			
			System.out.println("Not divided by zero");
		}
   }
	}
