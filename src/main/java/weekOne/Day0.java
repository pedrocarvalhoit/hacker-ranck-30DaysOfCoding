package weekOne;

import java.util.Scanner;

//Task
//To complete this challenge,
// you must save a line of input from stdin to a variable,
// print Hello, World. on a single line, and finally print the value of
// your variable on a second line.

public class Day0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write the output");
        var input = scan.nextLine();
        scan.close();

        System.out.println("Hello World: \n" + input);
    }

}
