package week5;

//https://www.hackerrank.com/challenges/30-bitwise-and/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many tests do you wnat to run?");
        int t = scan.nextInt();

        List<Integer> resultList = new ArrayList<>();
        while(t --> 0){
            System.out.println("First number");
            int count = scan.nextInt();
            System.out.println("Second number");
            int lim = scan.nextInt();

            resultList.add(bitwiseAnd(count, lim));
        }

        resultList.stream()
                .forEach(System.out::println);
    }

    public static int bitwiseAnd(int N, int K) {
        int maxBitwiseAnd = 0;

        for (int A = 1; A <= N; A++) {
            for (int B = A + 1; B <= N; B++) {
                int currentBitwiseAnd = A & B;
                if (currentBitwiseAnd < K && currentBitwiseAnd > maxBitwiseAnd) {
                    maxBitwiseAnd = currentBitwiseAnd;
                }

            }
        }

        return maxBitwiseAnd;

    }



}
