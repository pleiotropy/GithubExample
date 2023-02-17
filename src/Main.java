import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Get the total bill from the user
        System.out.print("Please enter the amount of the bill: ");
        double totalBill = s.nextDouble();

        // Get the percent tip from the user
        System.out.print("Please enter the tip, in percent, you want to leave: ");
        int tipPercentage = s.nextInt();

        // Get the number of people splitting the bill from the user
        System.out.print("Please enter the number of people splitting the bill: ");
        int numberOfPeople = s.nextInt();

        double tip = ((double)tipPercentage / 100) * totalBill;
        double total = totalBill + tip;
        double tipPerPerson = tip / numberOfPeople;
        double totalPerPerson = total / numberOfPeople;

        // Print it out
        System.out.print("The total tip amount is: ");
        System.out.printf("%.2f", tip);
        System.out.println();
        System.out.print("The total bill, including tip is: ");
        System.out.printf("%.2f", total);
        System.out.println();
        System.out.print("The tip per person is: ");
        System.out.printf("%.2f", tipPerPerson);
        System.out.println();
        System.out.print("The total per person is: ");
        System.out.printf("%.2f", totalPerPerson);
    }
}