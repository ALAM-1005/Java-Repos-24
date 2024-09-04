package Assignment;

class ElementCount {

    // Method to count the occurrences of a specified element in an array
    public static int countOccurrences(int[] arr, int target) {
        int count = 0; // Initialize count to 0

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the target, increment the count
            if (arr[i] == target) {
                count++;
            }
        }
        return count; // Return the total count
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {2, 4, 6, 4, 8, 10, 4};

        // Element to count
        int target = 4;

        // Call the countOccurrences method and store the result
        int result = countOccurrences(arr, target);

        // Print the result
        System.out.println("Element " + target + " occurs " + result + " times in the array.");
    }
}
