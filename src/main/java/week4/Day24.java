package week4;

//https://www.hackerrank.com/challenges/30-linked-list-deletion/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.*;

public class Day24 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("What is the size of the root?");
        int T = sc.nextInt();
        while(T-->0){
            System.out.println("Give me the numbers");
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        head = removeDuplicates(head);
        display(head);

    }

    public static Node removeDuplicates(Node head) {
        if (head == null){
            return null;
        }
        Set<Integer> set = new HashSet<>();
        Node curr = head;
        Node pre = null;
        while(curr != null){
            if(set.contains(curr.data)){
                pre.next = curr.next;
                curr = pre.next;
            }else {
                set.add(curr.data);
                pre = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public static  Node insert(Node head,int data){
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }

    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }



}
