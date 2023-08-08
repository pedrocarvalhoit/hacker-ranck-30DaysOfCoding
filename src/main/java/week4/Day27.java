package week4;

//https://www.hackerrank.com/challenges/30-testing/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Day27 {

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }

    public static int minimum_index(int[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("Array can´t be empty");
        }
        int minimum_index = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < array[minimum_index]){
                minimum_index = i;
            }
        }
        return minimum_index;
    }

    public static class TestDataEmptyArray{
        public static int[] get_array(){
            int[] array = {};
            return array;
        }
    }

    public static class TestDataUniqueValues{
        public static int[] get_array(){
            int[] array = {1, 2, 3, 4};
            return array;
        }
        public static int get_expected_result(){
            int[] array = {1, 2, 3, 4};
            int minIndex = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] < array[minIndex]){
                    minIndex = i;
                }
            }
            return minIndex;
        }
    }

    public static class TestDataExactlyTwoDifferentMinimums{
        public static int[] get_array(){
            int[] array = {1, 3, 4, 5, 1};
            return array;
        }
        public static int get_expected_result(){
            int[] array = {1, 1, 1, 1};
            int minIndex = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] < array[minIndex]){
                    minIndex = i;
                }
            }
            return minIndex;
        }

    }

    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

}
