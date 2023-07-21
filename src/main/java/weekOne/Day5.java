package weekOne;

import java.util.Scanner;

/**Task
 Given an integer, n, print its first 10 multiples.
 Each multiple n x i (where i < i < 10) should be printed on a new line in the form: n x i = result. */

public class Day5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int n = scan.nextInt();
        System.out.println("Now, how many multiples do you want?");
        int u = scan.nextInt();

        for (int i = 1; i <= u ; i++ ){
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }

}
