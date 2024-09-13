package day2;

public class Solution1 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
			int[] i = {10,15};
			System.out.println(i);
		}
		catch (ArithmeticException e) {
			System.out.println("Divided by zero try another number");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Arrays size is above");
		}
	}
}
