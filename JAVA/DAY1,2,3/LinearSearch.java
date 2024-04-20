/* b) Write a function named PerformLinearSearch that searches for a specific element in an
 *  array and returns the index of the element if found or -1 if not found.
*/

package assignment;

public class LinearSearch {

	public static int performLinearSearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		// Iterate over each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is equal to the target
            if (arr[i] == target) {
                // Return the index of the element if found
                return i;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {3, 6, 9, 12, 15};

        // Target element to search for
        int target = 12;

        // Perform linear search
        int index = performLinearSearch(array, target);

        // Print the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

	}

}

/* OUTPUT:  */
