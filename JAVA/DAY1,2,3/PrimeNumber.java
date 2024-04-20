/* --Task 1: Data Types/Variables
--Write a program that declares two integer variables, swaps their values without using a third variable, and prints the result. */

package assignment;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();
		        
		        
		        boolean isPrime = true;
		        
		        if (number <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i <= Math.sqrt(number); i++) {
		                if (number % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }
		        
		        if (isPrime) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }


	}

}
