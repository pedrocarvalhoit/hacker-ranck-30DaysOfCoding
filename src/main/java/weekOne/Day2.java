package weekOne;

import java.util.Scanner;

/**Task
 Given the meal price (base cost of a meal),
 tip percent (the percentage of the meal price being added as tip),
 and tax percent (the percentage of the meal price being added as tax)
 for a meal, find and print the meal's total cost. Round the result to the
 nearest integer.

 Example

 A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8.
 Print the value  and return from the function. */

public class Day2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much cost the meal?");
        Double meal = scan.nextDouble();
        System.out.println("How much is the tip in %?");
        int tip = scan.nextInt();
        System.out.println("How much is the tax in %?");
        int tax = scan.nextInt();

        int finalPrice = mealFinalPriceCalculator(meal, tip, tax);

        System.out.println("Final price: " + finalPrice);


    }

    public static int mealFinalPriceCalculator(Double mealCost, int tipPercent, int taxPercent){
        Double tip = (mealCost/ 100) * tipPercent;
        Double tax = (mealCost/ 100) * taxPercent;

        Double resultMealCost = mealCost + tip + tax;

        return (int) Math.round(resultMealCost);
    }


}
