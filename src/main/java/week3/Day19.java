package week3;

//https://www.hackerrank.com/challenges/30-interfaces/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.Scanner;

public class Day19 {

    interface AdvancedArithmetic{
        int divisorSum(int n);
    }

    static class Calculator implements AdvancedArithmetic{

        public int divisorSum(int n) {
            int i = 1;
            int sum = 0;
            while (i <= n) {
                if(n % i == 0){
                    sum += i;
                }
                i++;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number");
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic calculator = new Calculator();
        System.out.println(calculator.divisorSum(n));

        System.out.println("Implementation of: " + calculator.getClass().getInterfaces()[0].getName());

    }

}
