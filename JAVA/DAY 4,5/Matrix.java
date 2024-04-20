/*Day 4 and Day 5
Task 1: Constructors
Implement a Matrix class that has a constructor which initializes the dimensions of a matrix and a method to fill the matrix with values.
*/

package assignment;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    // Constructor to initialize the dimensions of the matrix
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    // Method to fill the matrix with values
    public void fillMatrix(int[][] values) {
        // Check if the provided values match the dimensions of the matrix
        if (values.length != rows || values[0].length != columns) {
            System.out.println("Error: Invalid dimensions of values array.");
            return;
        }

        // Copy the values to the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = values[i][j];
            }
        }
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a matrix with dimensions 3x3
        Matrix matrix = new Matrix(3, 3);

        // Fill the matrix with values
        int[][] values = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        matrix.fillMatrix(values);

        // Print the matrix
        System.out.println("Matrix:");
        matrix.printMatrix();
    }
}

