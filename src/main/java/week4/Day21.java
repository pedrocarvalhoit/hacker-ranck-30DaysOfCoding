package week4;

//https://www.hackerrank.com/challenges/30-generics/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day21 {

    public static <T> void printArray(T[] array){
        for (T element : array){
           System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tel me the size of the array");

        int n = scan.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i< n; i++){
            System.out.println("Now give me Strings");
            stringArray[i] = scan.next();
        }

        System.out.println("Tel me the size of the array");
        n = scan.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i< n; i++){
            System.out.println("Now give me the numbers");
            intArray[i] = scan.nextInt();
        }

        printArray(stringArray);
        printArray(intArray);

    }

}
