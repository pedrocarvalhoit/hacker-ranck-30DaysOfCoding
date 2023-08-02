package week4;

//https://www.hackerrank.com/challenges/30-binary-search-trees/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import org.w3c.dom.Node;

import java.util.Scanner;

public class Day22 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is the size of the root?");
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            System.out.println("Give me the numbers");
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }

    public static int getHeight(Node root){
        if (root == null){
            return -1;
        }else{
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }

    }
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }


}
