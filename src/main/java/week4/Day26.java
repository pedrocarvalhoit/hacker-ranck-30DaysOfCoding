package week4;

//https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Day26 {

    public static int library(int d1, int m1, int y1, int d2, int m2, int y2){
        LocalDate returnedDate = LocalDate.of(y1, m1, d1);
        LocalDate dueDate = LocalDate.of(y2, m2, d2);
        int result = 1;

        if (returnedDate.isBefore(dueDate) || dueDate.isEqual(returnedDate)){
            result = 0;
            System.out.println("Book on date");
        }else if (returnedDate.getYear() > dueDate.getYear()) {
            result = 10000;
            System.out.println("Anual delay");
        } else if (returnedDate.getYear() == dueDate.getYear() && returnedDate.getMonth() == dueDate.getMonth()) {
            long lateDays = ChronoUnit.DAYS.between(dueDate, returnedDate);
            result = (int) (15 * lateDays);
            System.out.println("Daily delay");
        }else if (returnedDate.getYear() == dueDate.getYear() &&
                returnedDate.isAfter(dueDate)) {
            long lateMonths = ChronoUnit.MONTHS.between(dueDate, returnedDate);
            result = (int) (500 * lateMonths);
            System.out.println("Monthly delay");
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Returned day");
        int d1 = scan.nextInt();
        System.out.println("Returned month");
        int m1 = scan.nextInt();
        System.out.println("Returned year");
        int y1 = scan.nextInt();
        System.out.println("Due day");
        int d2 = scan.nextInt();
        System.out.println("Due month");
        int m2 = scan.nextInt();
        System.out.println("Due year");
        int y2 = scan.nextInt();

        System.out.println(library(d1, m1, y1, d2, m2, y2));

    }

}
