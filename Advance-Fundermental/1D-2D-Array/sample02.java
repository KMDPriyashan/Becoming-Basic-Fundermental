// Question 02: 2D Array - Matrix Operations
//Problem Statement:
//  Write a Java program that works with a 2D array (matrix) of size 3×3. The program should:
//  Accept 9 integer values from the user to fill a 3×3 matrix.
//  Display the matrix in a 3×3 grid format.

//Find and display:
//  Sum of all elements in the matrix
//  Sum of the main diagonal (top-left to bottom-right)
//  Sum of the anti-diagonal (top-right to bottom-left)
//  Find and display the transpose of the matrix.
import java.util.Scanner;
public class sample02 {
    static int[][] array = new int[3][3];
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print("Enter the value of ["+x+"] ["+y+"] :");
                array [x][y] = scan.nextInt();
            }
        }
        displayarray();

    }
    public static void displayarray() {
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.println("values ["+x+"] ["+y+"] :"+array[x][y]);
            }
        }
    }
}
