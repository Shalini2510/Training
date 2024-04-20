/*Task 5: Two-Sum Problem
a) Given an array of integers, write a program that finds if there are two numbers that add up to a specific target. You may assume that each input would have exactly one solution, and you may not use the same element twice. Optimize the solution for time
 complexity.*/


package assignment;
import java.util.Arrays;
public class TwoSum {
	public static int[] findTwoSum(int[] nums, int target) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        // Initialize two pointers: one at the beginning and one at the end of the array
        int left = 0;
        int right = nums.length - 1;

        // Iterate until the two pointers meet
        while (left < right) {
            // Calculate the sum of the numbers at the current positions
            int sum = nums[left] + nums[right];

            // If the sum is equal to the target, return the indices of the two numbers
            if (sum == target) {
                return new int[]{left, right};
            }
            // If the sum is less than the target, move the left pointer to the right
            else if (sum < target) {
                left++;
            }
            // If the sum is greater than the target, move the right pointer to the left
            else {
                right--;
            }
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15,2,7,4,5};
        int target = 13;

        // Find the indices of two numbers that add up to the target
        int[] result = findTwoSum(nums, target);

        // Print the result
        System.out.println("The Target is: "+target);
        if (result.length == 2) {
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
            System.out.println("The numbers are: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }

	}

}

/* OUTPUT: The Target is: 13
Indices of the two numbers: 0, 6
The numbers are: 2, 11*/
