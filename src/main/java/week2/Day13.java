package week2;

// https://www.hackerrank.com/challenges/30-abstract-classes/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the book title?");
        String title = scan.nextLine();
        System.out.println("What is the author name?");
        String author = scan.nextLine();
        System.out.println("What is the price?");
        int price = scan.nextInt();

        Book book = new MyBook(title, author, price);
        book.display();

    }

    static abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    static class MyBook extends Book{

        int price;

        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        @Override
        void display() {
            System.out.println("Title: " + this.title + "\n" +
                    "Author: " + this.author + "\n" +
                    "Price: " + this.price);
        }


    }



}
