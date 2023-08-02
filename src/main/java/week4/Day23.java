package week4;

//https://www.hackerrank.com/challenges/30-binary-trees/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23 {

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
        levelOrder(root);
    }

    static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.print(node.data + " ");
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
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
