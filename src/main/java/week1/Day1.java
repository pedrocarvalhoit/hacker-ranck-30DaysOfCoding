package week1;

import java.util.Scanner;

/**Task
 Complete the code in the editor below. The variables
 and  are already declared and initialized for you. You must:

 Declare  variables: one of type int, one of type double, and one of type String.
 Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
 Use the  operator to perform the following operations:
 Print the sum of  plus your int variable on a new line.
 Print the sum of  plus your double variable to a scale of one decimal place on a new line.
 Concatenate  with the string you read as input and print the result on a new line.

 Input Format

 The first line contains an integer that you must sum with .
 The second line contains a double that you must sum with .
 The third line contains a string that you must concatenate with .*/

public class Day1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        System.out.println("Please write 3 types, starting with a int:");
        int a =scan.nextInt();
        System.out.println("Now a double:");
        double b = scan.nextDouble();
        scan.nextLine(); //This consumes the line left by de scan Double
        System.out.println("And a String to finish");
        String c = scan.nextLine();

        System.out.println(i + a);
        System.out.println(d + b);
        System.out.println(s + c);

        scan.close();
    }
}
