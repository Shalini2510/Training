/* Task 4: Arrays - Declaration, Initialization, and Usage
Create a program that declares an array of integers, initializes it with consecutive numbers, 
and prints the array in reverse order.*/



package assignment;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] num = new int[5]; 
		        for (int i = 0; i < num.length; i++) {
		            num[i] = i + 1; 
		        }
		        
		        System.out.println("Original array:");
		        printArray(num);
		        
		        System.out.println("\nArray in reverse order:");
		        printReverseArray(num);
		    }	    
		    public static void printArray(int[] arr) {
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		    
		    public static void printReverseArray(int[] arr) {
		        for (int i = arr.length - 1; i >= 0; i--) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();

	}

}



/* OUTPUT: 
Original array:
1 2 3 4 5 

Array in reverse order:
5 4 3 2 1  */
