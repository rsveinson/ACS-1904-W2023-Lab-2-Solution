import java.util.Scanner;
import java.util.Random;

/** 
 * ACS-1904 Assignment X Question Y
 * @author 
 */

public class SumOfRows{
    public static void main(String[] args) {
        final int ROWS = 5;
        final int COLUMNS = 5;


        int table[][] = new int[ROWS][COLUMNS];
        int sumOfRow[] = new int[ROWS];
        int sum = 0;

        // load the table
        loadTable(table, ROWS, COLUMNS);
        
        // Print the table so we can verify that the sum is correct
        //printTable(table, ROWS, COLUMNS);

        // find the sum of each row and add it to the sumOrRow array
        for(int i = 0; i < ROWS; i++){
            // start summing at 0
            sum = 0;

            for(int j = 0; j < COLUMNS; j++){
                sum += table[i][j];
            }//end j
            //System.out.println(sum);
            // add the sum of row i to the sumOfRow array at index i
            sumOfRow[i] = sum;
        }//END FOR I

        // print the list of sums
        printList(sumOfRow, ROWS);

        System.out.println("end of program");
    }

    public static void loadTable(int[][] t, int rows, int columns){
        // keep the random number local
        // it expires when the method returns to main
        Random r = new Random();
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                t[i][j] = r.nextInt(10) + 1;
            }// end for j
        }// end for i    
    }// end load tab le

    public static void printList(int[] list, int size){
        for(int i = 0; i < size; i++){
            System.out.println(list[i]);
        }//end i
    }// end print list

    public static void printTable(int[][] t, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(t[i][j] + " ");
            }// end j
            System.out.println();
        }//end i
    }// end printtable
}
