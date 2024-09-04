package Assignment;

public class SumDigitsArr {
    public class ReplaceWithDigitSum {

        // Method to calculate the sum of digits of a number
        public static int sumOfDigits(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10; // Add the last digit to the sum
                num /= 10;       // Remove the last digit
            }
            return sum;
        }
    
        // Method to replace every element in the array with the sum of its digits
        public static void replaceWithDigitSum(int[] arr) {
            // Iterate through the array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sumOfDigits(arr[i]); // Replace element with the sum of its digits
            }
        }
    
        public static void main(String[] args) {
            // Example array
            int[] arr = {123, 456, 789, 101, 55};
    
            // Print the original array
            System.out.print("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
    
            // Call the replaceWithDigitSum method
            replaceWithDigitSum(arr);
    
            // Print the modified array
            System.out.print("\nModified array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    
}
