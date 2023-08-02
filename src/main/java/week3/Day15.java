package week3;

// https://www.hackerrank.com/challenges/30-linked-list/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.ArrayList;
import java.util.List;

public class Day15 {

    static class Node {
        int data;
        Node next;

        public Node() {
        }

        Node(int d) {
            data = d;
            next = null;
        }

        public Node insert(Node head, int data){
            if(head==null){
                return new Node(data);
            }
            head.next = insert(head.next, data);
            return head;
        }

        public void display(Node head){
            Node start = head;
            while(start != null){
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

    }

    public static void main(String[] args) {
        Node head = new Node();
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);

        for(Integer number:list){
            head.insert(head, number);
        }
        head.display(head);

    }

}
