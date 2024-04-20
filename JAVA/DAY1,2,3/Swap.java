/* Task 1: Data Types/Variables
Write a program that declares two integer variables, 
swaps their values without using a third variable, and prints the result.*/

package assignment;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int a = 10;
		        int b = 20;
		        
		        System.out.println("Before swapping:");
		        System.out.println("a = " + a);
		        System.out.println("b = " + b);
		        
		        a = a + b;
		        b = a - b;
		        a = a - b;
		        
		        System.out.println("\nAfter swapping:");
		        System.out.println("a = " + a);
		        System.out.println("b = " +b);
		    }	

}

/* OUTPUT :Before swapping:
a = 10
b = 20

After swapping:
a = 20
b = 10  */
