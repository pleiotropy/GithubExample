import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Get dollar amount from the user
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a dollar amount: ");
        double dollar = s.nextDouble();

        // Divide the dollar amount by the value of a quarter to
        // determine how many quarters you will need
        int numberOfQuarters = (int) (dollar / 0.25);

        // Subtract the amount covered by the quarters from the
        // original dollar amount to get the remaining amount
        // you still need to cover with other coins
        double amountAfterQuarters = dollar - ((double)numberOfQuarters * 0.25);

        // Divide the amountAfterQuarters by the value of a dime
        // to determine how many dimes you will need
        int numberOfDimes = (int) (amountAfterQuarters / 0.1);

        // Subtract the amount covered by the dimes from the
        // amountAfterQuarters to get the remaining amount
        double amountAfterDimes = amountAfterQuarters - ((double)numberOfDimes * 0.1);

        // Divide the amountAfterDimes by the value of a nickel
        // to determine how many nickels you will need
        int numberOfNickels = (int) (amountAfterDimes / 0.05);

        // Subtract the amount covered by the nickels from the
        // amountAfterDimes to get the remaining amount
        double amountAfterNickels = amountAfterDimes - ((double)numberOfNickels * 0.05);

        // Divide the amountAfterNickels by the value of a penny
        // to determine how many pennies you will need
        int numberOfPennies = (int) (amountAfterNickels / 0.01);

        // Add up the number of each coin to get the minimum
        // number of coins
        int minimum = numberOfQuarters + numberOfDimes + numberOfNickels + numberOfPennies;

        // Print it out
        System.out.println("The minimum number of coins is " + minimum + ":");
        System.out.println(numberOfQuarters + " quarters");
        System.out.println(numberOfDimes + " dimes");
        System.out.println(numberOfNickels + " nickels");
        System.out.println(numberOfPennies + " pennies");

        /*
        double a = 18.24;  // 18
        double b = 212.5;  // 213
        double c = -5.3;   // -5
        double d = -25.77; // -26

        double newA = a - (int) a;
        double newB = b - (int) b;
        double newC = c - (int) c;
        double newD = d - (int) d;

        System.out.println(newA);
        System.out.println(newB);
        System.out.println(newC);
        System.out.println(newD);

         */

    }
}