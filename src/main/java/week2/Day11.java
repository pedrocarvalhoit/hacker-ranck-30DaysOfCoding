package week2;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rowSize = 5;
        int colSize = 5;

        int[][] myArray = new int[rowSize][colSize];

        int count = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                myArray[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

    }

}

