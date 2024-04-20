package assignment;

import java.util.Arrays;

public class Fibonacci {
    // Recursive function to find the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: when n is 0 or 1
        if (n <= 1) {
            return n;
        }
        // Recursive case: when n is greater than 1
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Function to generate the first n Fibonacci numbers and store them in an array
    public static int[] generateFibonacciArray(int n) {
        int[] fibonacciArray = new int[n];
        // Iterate over each index in the array and calculate the corresponding Fibonacci number
        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacci(i);
        }
        return fibonacciArray;
    }

    public static void main(String[] args) {
        // Define the value of n
        int n = 5; // Change this value to generate a different number of Fibonacci numbers

        // Generate the first n Fibonacci numbers and store them in an array
        int[] fibonacciArray = generateFibonacciArray(n);
        
     // Find and print the nth Fibonacci number
        int nthElement = fibonacci(n - 1);
        System.out.println("The " + n + "th Fibonacci number is: " + nthElement);

        // Print the Fibonacci array
        System.out.println("First " + n + " Fibonacci numbers: " + Arrays.toString(fibonacciArray));

        
    }
}
