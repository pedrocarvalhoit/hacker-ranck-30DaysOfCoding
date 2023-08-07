package week4;

//https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day25 {

    public static boolean prime(int n){

        if(n % 2 == 0 && n != 2 || n == 1){
            return false;
        }

        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to check?");
        int n = scan.nextInt();

        List<String> list = new ArrayList<>();

        while (n --> 0){
            System.out.println("Give me the number");
            int s = scan.nextInt();
            boolean result = prime(s) ? list.add("Prime") : list.add("Not prime");
        }

        for(String value : list){
            System.out.println(value);
        }

    }

}
