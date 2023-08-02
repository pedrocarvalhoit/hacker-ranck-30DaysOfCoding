package week2;

import java.util.Scanner;

/**Task
 Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base- 10integer denoting the maximum number of
 consecutive 1's in n's binary representation.
 When working with different bases, it is common to show the base as a subscript. */

public class Day10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number to convert to binary");
        int n = scan.nextInt();

        String binaryN = Integer.toBinaryString(n);

        System.out.println(binaryN);

        int count = 0, max =0;
        while (n > 0){
            int a = n%2;
            if(a == 1) count++;
            else {
                if (max < count){
                    max = count;
                }
                count = 0;
            }
            n = n/2;
        }
        if(max < count){
            max = count;
        }

        System.out.println(max);
    }

}


