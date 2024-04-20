/* Task 7: Array Sorting and Searching
a) Implement a function called BruteForceSort that sorts an array using the brute force approach.
 Use this function to sort an array created with InitializeArray.*/



package assignment;
import java.util.Arrays;
public class BruteForce {
	
	public static void bruteForceSort(int[] arr) {
        int n = arr.length;
        // Iterate over each element in the array
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        // Create and initialize an array
        int[] array = {5, 3, 8, 2, 7, 1};

        // Sort the array using brute force approach
        bruteForceSort(array);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

}


/*OUTPUT:   */
