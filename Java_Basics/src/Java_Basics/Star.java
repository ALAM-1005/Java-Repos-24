package Java_Basics;
import java.util.Scanner;

public class Star {
		public static void main(String[] args) {
			
			
		    Scanner sc  = new Scanner (System.in);

		    System.out.println("Enter the number");

		    int n = sc.nextInt();

		    for(int i=1;i<=n;i++){
		        System.out.print("*"+" ");
		    }

		    sc.close();
		
		}
		}
		    
