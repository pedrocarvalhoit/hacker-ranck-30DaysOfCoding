package weekTwo;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** Task
 Given n names and phone numbers, assemble a phone book that maps friends'
 names to their respective phone numbers. You will then be given an unknown number of names
 to query your phone book for. For each name queried, print the associated entry from your phone
 book on a new line in the form name=phoneNumber;
 if an entry for name is not found, print Not found instead. */

public class Day8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        System.out.println("How many numbers do you want to add at the phone book?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Type just the first name :");
            String name = scan.next();
            System.out.println("Now just the number of the phone");
            int phone = scan.nextInt();
            phoneBook.put(name, phone);
        }

        System.out.println("Now, how many searchs do you want to do?");
        int s = scan.nextInt();
        for (int i = 0; i < s; i++){;
            System.out.println("Type the first name:");
            String name = scan.next();
            if(phoneBook.containsKey(name)){
                int phone = phoneBook.get(name);
                System.out.println(name + " = " + phone);
            }else {
                System.out.println("Not found");
            }
        }




    }

}
