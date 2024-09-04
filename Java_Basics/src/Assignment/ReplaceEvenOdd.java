package Assignment;

public class ReplaceEvenOdd {


        // Method to replace even elements with 0 and odd elements with 1
        public static void replaceEvenOdd(int[] arr) {
            // Iterate through the array
            for (int i = 0; i < arr.length; i++) {
                // Replace even numbers with 0
                if (arr[i] % 2 == 0) {
                    arr[i] = 0;
                } 
                // Replace odd numbers with 1
                else {
                    arr[i] = 1;
                }
            }
        }
    
        public static void main(String[] args) {
            // Example array
            int[] arr = {2, 5, 7, 8, 10, 13};
    
            // Print the original array
            System.out.print("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
    
            // Call the replaceEvenOdd method
            replaceEvenOdd(arr);
    
            // Print the modified array
            System.out.print("\nModified array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    
    

