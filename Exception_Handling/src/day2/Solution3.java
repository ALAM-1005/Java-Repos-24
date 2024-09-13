package day2;

public class Solution3 {
	public static void main(String[] args) {

		try {

			
			
			try {
				System.out.println(10/0);
			}
			catch (Exception e) {
				System.out.println("Divided by zero try another number");
			}

			int[] i = {10,15};
			System.out.println(i[10]);
		}
		catch (ArithmeticException e) {
			System.out.println("Divided by zero try another number");
		}

		catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("Arrays size is above");
		}
	}
}
