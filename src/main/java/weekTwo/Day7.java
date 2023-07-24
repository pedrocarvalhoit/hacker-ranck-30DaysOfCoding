package weekTwo;

import java.util.*;

/** Task
        Given an array, A, oN f  integers, print A's elements in reverse order as a single line of space-separated numbers.*/

public class Day7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want in the array?");
        int n = scan.nextInt();

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < n; i++){
            array.add(i);
        }

        for (int i = n-1; i >=0; i--){
            System.out.print(array.get(i) + " ");
        }

        Collections.reverse(array);
        for (int numero:array) {
            System.out.print("\n" + numero);
        }

    }





}
