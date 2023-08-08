package week5;

//https://www.hackerrank.com/challenges/30-regex-patterns/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {

    public static class Register {
        private String name;
        private String email;

        public Register(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("How many emails will be registered?");
            int n = scan.nextInt();

            List<Register> database = new ArrayList<>();
            Pattern pattern = Pattern.compile("\\b[\\w.%+-]+@gmail\\.com\\b");

            while (n-- > 0) {
                System.out.println("Name first: ");
                String firstName = scan.next();
                System.out.println("Email: ");
                String emailID = scan.next();

                Matcher matcher = pattern.matcher(emailID);
                if (matcher.find()){
                    database.add(new Register(firstName, emailID));
                }

            }

            Collections.sort(database, Comparator.comparing(Register::getName));

            database.stream()
                    .map(Register::getName)
                    .forEach(System.out::println);

        }
    }
}
