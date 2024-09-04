public class ArraySearch {

    // Method to search for an element in an array
    public static int searchElement(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the target is found, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // If the element is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {2, 4, 6, 8, 10};

        // Element to search for
        int target = 6;

        // Call the searchElement method and store the result
        int result = searchElement(arr, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
