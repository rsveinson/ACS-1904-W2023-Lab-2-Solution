import java.util.Scanner;
import java.util.Random;

/** 
 * ACS-1904 Lab 2 Q4
 * @Sveinson
 * a method to set all elements of a 2D array to some value
 * a method to set the diagonals of a square (n x n) 2D array to some value
 */

public class Diagonals{
    public static void main(String[] args) {
        final int ROWS = 15;
        final int COLUMNS = 15;
        int n = 0;


        int table[][] = new int[ROWS][COLUMNS];

        fillTable(table, ROWS, COLUMNS, n);
        // set the diagonals to 1
        fillDiagonal(table, ROWS, COLUMNS, 1);
        
        // Print the table so we can verify that the sum is correct
        printTable(table, ROWS, COLUMNS);

        System.out.println("end of program");
    }


    /*****************************
     * i'm going to use rows and columns here instead of depending
     * on t[i].length to make the method scaleable, it can handle
     * a partially filled 2Darray
     */
    public static void fillDiagonal(int[][] t, int rows, int columns, int filler){
        for(int i = 0; i < rows; i++){
            // prett obivous this one
            t[i][i] = filler;
            
            /* in the following j = column
             * in row 0 i need to fill both j = 0 and j = n -1 with filler
             * in row 1 I need to fill both j = 1 and j = n - 1 -1
             * in row 2 I need to fill both j = 2 and j = n - 2 -1
             * since j = i = 0, 1, 2, 3, ... n - 1 i can sub it in 
             * for the first subtraction
             */
            t[i][columns - 1 - i] = filler;
        }// end i
    }
    
    public static void fillTable(int[][] t, int rows, int columns, int value){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                t[i][j] = value;
            }// end for j
        }// end for i
    }


    public static void printTable(int[][] t, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(t[i][j] + " ");
            }// end j
            System.out.println();
        }//end i
    }// end printtable
}
