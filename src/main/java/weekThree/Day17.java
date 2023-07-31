package weekThree;

//https://www.hackerrank.com/challenges/30-more-exceptions/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me the fisrt integer");
        int n = scan.nextInt();
        System.out.println("Give me the second integer");
        int p = scan.nextInt();

        Calculator calculator = new Calculator();


        try{
            System.out.println(calculator.power(n, p));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    static class Calculator{

        public int power(int n, int p){
            if (n < 0 || p < 0){
                throw new IllegalArgumentException("n and p should be non-negative");
            }

            int result = (int) Math.pow(n, p);

            return result;
        }

    }

}
