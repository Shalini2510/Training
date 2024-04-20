package assignment;
import java.util.Arrays;

public class ArraySlicer {

	
	 public static int[] sliceArray(int[] arr, int start, int end) {
	        // Check if the start index and end index are valid
	        if (start < 0 || end >= arr.length || start > end) {
	            // If not valid, return an empty array or throw an exception
	            return new int[0]; // You can also throw an IllegalArgumentException
	        }

	        // Calculate the length of the sliced array
	        int length = end - start + 1;

	        // Create a new array to store the sliced elements
	        int[] slicedArray = new int[length];

	        // Copy the elements from the original array to the sliced array
	        for (int i = 0; i < length; i++) {
	            slicedArray[i] = arr[start + i];
	        }

	        return slicedArray;
	    }

	    public static void main(String[] args) {
	        // Example array
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        // Start and end indices for slicing
	        int start = 2;
	        int end = 5;

	        // Slice the array
	        int[] slicedArray = sliceArray(array, start, end);

	        // Print the sliced array
	        System.out.println("Sliced array: " + Arrays.toString(slicedArray));
	    }
	

	

}
