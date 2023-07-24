package weekTwo;

import java.util.Scanner;

/** https://www.hackerrank.com/challenges/30-recursion/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen */

public class Day9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number");
        int n = scan.nextInt();

        int result = Recursion.factorial(n);
        System.out.println(result);

    }

    public static class Recursion{

        public static int factorial(int n){
            if (n == 1 ){
                return 1;
            }
            return n * factorial(n-1);
        }

    }

}
