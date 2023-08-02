package week1;

import java.util.Scanner;

/** Given a string, s, of length n that is indexed from 0 to n-1, print its even-indexed
        and odd-indexed characters as  3space-separated strings on a single line
        (see the Sample below for more detail).

        Note:  0 is considered to be an even index.*/

public class Day6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Result result = new Result();

        System.out.println("How many words do you wnat to split?");
        int T = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i<T; i++){
            System.out.println("Write a String to split on evens and odds");
            String s = scan.nextLine();
            result.spliter(s);
        }
        scan.close();

    }

    public static class Result{
        public void spliter(String s){

           char[] charArray = s.toCharArray();

           StringBuilder evenIndexesString = new StringBuilder();
           StringBuilder oddIndexesString = new StringBuilder();

           for (int i = 0; i < charArray.length; i++){
               if (i % 2 == 0){
                   evenIndexesString.append(charArray[i]);
               }else{
                   oddIndexesString.append(charArray[i]);
               }
           }

           String evenIndexesResult = evenIndexesString.toString();
           String oddIndexesResult = oddIndexesString.toString();

            System.out.println(evenIndexesResult + " " + oddIndexesResult);
        }
    }

}
