/* 
Task 4: Basic Exception Handling
Write a program that attempts to divide by zero, catches the ArithmeticException, and provides a custom error message.

*/
package assignment;



public class DivideByZero{
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException and provide a custom error message
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static int divide(int dividend, int divisor) {
        // Check if the divisor is zero
        if (divisor == 0) {
            // Throw an ArithmeticException if attempting to divide by zero
            throw new ArithmeticException("Division by zero");
        }
        // Otherwise, perform the division and return the result
        return dividend / divisor;
    }
}

/**/
