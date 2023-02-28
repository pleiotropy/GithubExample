public class TipCalculator {
    private double totalBill;
    private int tipPercentage;
    private int numberOfPeople;
    private double tipAmount;
    private double total;
    private double tipPerPerson;
    private double totalPerPerson;

    // Constructor
    public TipCalculator(double totalBill, int tipPercentage, int numberOfPeople)
    {
        this.totalBill = totalBill;
        this.tipPercentage = tipPercentage;
        this.numberOfPeople = numberOfPeople;
    }

    /* CALCULATIONS */

    // Calculate the amount of the tip
    public void calculateTipAmount()
    {
        tipAmount = ((double)tipPercentage / 100) * totalBill;
    }

    // Calculate the total including the tip
    public void calculateTotal()
    {
        total = totalBill + tipAmount;
    }

    // Calculate the amount of the tip per person
    public void calculateTipPerPerson()
    {
        tipPerPerson = tipAmount / numberOfPeople;
    }

    // Calculate the total per person
    public void calculateTotalPerPerson()
    {
        totalPerPerson = total / numberOfPeople;
    }

    /* PRINTING */

    public void printTotalTipAmount()
    {
        System.out.print("The total tip amount is: ");
        System.out.printf("%.2f", tipAmount);
        System.out.println();
    }

    public void printTotalBill()
    {
        System.out.print("The total bill, including tip is: ");
        System.out.printf("%.2f", total);
        System.out.println();
    }

    public void printTipPerPerson()
    {
        System.out.print("The tip per person is: ");
        System.out.printf("%.2f", tipPerPerson);
        System.out.println();
    }

    public void printTotalPerPerson()
    {
        System.out.print("The total per person is: ");
        System.out.printf("%.2f", totalPerPerson);
        System.out.println();
    }

    // Print them all
    public void printAll()
    {
        printTotalTipAmount();
        printTotalBill();
        printTipPerPerson();
        printTotalPerPerson();
    }
}
