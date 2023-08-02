package weekThree;

//https://www.hackerrank.com/challenges/30-sorting/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day20 {

    public static void main(String[] args) {
        Integer[] ai= {3,2,1, 5,9,6};
        List<Integer> a = new ArrayList<>(Arrays.asList(ai));

        int swap = 0;
        for (int i = 0; i < a.size(); i++){

            for (int j = 0; j < a.size() - 1; j++){
                if (a.get(j) > a.get(j+1)){
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j + 1, temp);
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
        }

        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First element: " + a.get(0));
        System.out.println("Second Element: " + a.get(a.size() - 1));

    }

}
