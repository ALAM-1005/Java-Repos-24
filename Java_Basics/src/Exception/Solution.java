package  Exception;

public class Solution {

    public static void main(String[] args) {


        try{

            System.out.println(10/0);

        }
        catch(Exception e){

            System.out.println("Cant divided by zero");

        }
    }
    
}
