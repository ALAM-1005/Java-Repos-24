package pattern;
import java.util.Scanner;

public class star {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number ");

        int n = scan.nextInt();

        for(int i=1;i<=n;i++){

            System.out.print("*");
        }
        System.out.println();
    }


    
}
