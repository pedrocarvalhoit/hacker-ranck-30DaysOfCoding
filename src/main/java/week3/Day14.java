package week3;

//https://www.hackerrank.com/challenges/30-scope/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

public class Day14 {

    public static void main(String[] args) {

        int [] array = {25,5,6,7};
        Difference difference = new Difference(array);

        System.out.println(difference.computeDifference());

    }

    static class Difference {
        private int[] elements;
        public int maximumDifference;

        public Difference(int[] elements) {
            this.elements = elements;
        }

        public int m = 0;

        int computeDifference() {
            int minElment = elements[0];
            int maxElement = elements[0];

            for (int i = 0; i < elements.length; i++){
                if(elements[i] < minElment){
                    minElment = elements[i];
                }
                if (elements[i] > maxElement){
                    maxElement = elements[i];
                }
            }

            maximumDifference = Math.abs(maxElement - minElment);

            return maximumDifference;
        }
    }
}
