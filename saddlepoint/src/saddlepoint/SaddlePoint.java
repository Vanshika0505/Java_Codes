package saddlepoint;

import java.util.*;
public class SaddlePoint {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number of rows: ");
int rows = scanner.nextInt();
System.out.println("Enter number of columns: ");
int columns = scanner.nextInt();
int[][] matrix = new int[rows][columns];
System.out.println("Enter the elements of the matrix:");
for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
}
 // Print the matrix
 System.out.println("The matrix you entered is:");
 for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
    }
    // Close the scanner
    scanner.close();
int[] saddlePoint = findSaddlePoint(matrix);
if (saddlePoint[0] != -1 && saddlePoint[1] != -1) {
         System.out.println("Saddle Point found at: (" + saddlePoint[0] + ", " + saddlePoint[1] + ")");
        }
else {
            System.out.println("No Saddle Point found.");
        }
}
 
public static int[] findSaddlePoint(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            int minInRow = Integer.MAX_VALUE;
            int colIndexOfMin = -1;
            // Find the minimum element in the row
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    colIndexOfMin = j;
                }
            }
            boolean isMaxInColumn = true;
           // Check if it's the maximum in its column
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndexOfMin] > minInRow) {
                    isMaxInColumn = false;
                    break;
                }
            }
          // If it's the maximum in its column, it's a saddle point
            if (isMaxInColumn) {
                return new int[]{i, colIndexOfMin};
            }
        }
   // If no saddle point found
        return new int[]{-1, -1};
    }
}
 
