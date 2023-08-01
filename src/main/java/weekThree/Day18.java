package weekThree;

//https://www.hackerrank.com/challenges/30-queues-stacks/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.*;

public class Day18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution p = new Solution();

        System.out.println("Let´s see if you can give me a palíndrome");
        String s = scan.nextLine();
        scan.close();

        char[] ca = s.toCharArray();

        for(char c : ca){
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;

        for(int i = 0; i < ca.length/2; i++){
            if (p.popCharacter() != p.dequeueCharacter()){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word " + s + (((!isPalindrome)) ? ", is not a palindrome." : ", is a palindrome.") );

    }

    static class Solution{

        public Stack<Object> stack = new Stack<Object>();
        public Queue<Object> queue = new LinkedList<Object>();

        void pushCharacter(char c){
            stack.push(c);
        }

        char popCharacter(){
            return (char) stack.peek();
        }

        void enqueueCharacter(char c){
            queue.add(c);
        }

        char dequeueCharacter(){
            return (char) queue.peek();
        }

    }

}
