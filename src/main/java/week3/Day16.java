package week3;

//https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a String, with just numbers.");
        String string = scan.nextLine();

        try {
            int number = Integer.parseInt(string);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }


    }

}
