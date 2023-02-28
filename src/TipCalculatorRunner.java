import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args)
    {
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

        // Create the TipCalculator object
        TipCalculator tipCalc = new TipCalculator(totalBill, tipPercentage, numberOfPeople);

        // Calculate stuff!
        tipCalc.calculateTipAmount();
        tipCalc.calculateTotal();
        tipCalc.calculateTipPerPerson();
        tipCalc.calculateTotalPerPerson();

        // Print that stuff!
        tipCalc.printAll();
    }
}
