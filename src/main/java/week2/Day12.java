package week2;

// https://www.hackerrank.com/challenges/30-inheritance/problem?h_r=next-challenge&h_v=zen

import java.util.Arrays;
import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First score");
        int firstScore = scan.nextInt();
        System.out.println("Second score");
        int secondScore = scan.nextInt();
        int[] testScores = new int[]{firstScore, secondScore};
        Student student = new Student("Pedro", "Carvalho", 2, testScores);
        student.printPerson();
        System.out.println("Grade = " + student.calculate());

    }

    public static  class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    public static class Student extends Person{
        private int[] testScores;

        public Student(String firstName, String lastName, int identification,int[] testScores) {
            super(firstName, lastName, identification);
            this.testScores = testScores;
        }

        public Character calculate(){
            double avarage = Arrays.stream(this.testScores).average().orElse(0.0);
            char gradingScale = 0;
            if(avarage < 40){
                gradingScale = 'T';
            }else if (avarage < 55){
                gradingScale = 'D';
            }else if (avarage < 70){
                gradingScale = 'P';
            }else if (avarage < 80){
                gradingScale = 'A';
            }else if (avarage < 90){
                gradingScale = 'E';
            }else if (avarage <= 100){
                gradingScale = 'O';
            }
            return gradingScale;
        }

    }

}
