import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Get the user's name
        System.out.print("Please enter a five-digit number (ex: 25497): ");
        int userNumber = s.nextInt();

        // Get the first digit
        int first = userNumber / 10000;
        first++;
        first %= 10;

        // Get the second digit
        int second = (userNumber % 10000) / 1000;
        second++;
        second %= 10;

        // Get the third digit
        int third = (userNumber % 1000) / 100;
        third++;
        third %= 10;

        // Get the fourth digit
        int fourth = (userNumber % 100) / 10;
        fourth++;
        fourth %= 10;

        // Get the fifth digit
        int fifth = userNumber % 10;
        fifth++;
        fifth %= 10;

        // Print name and average
        System.out.print("Your number (" + userNumber + ") with each digit incremented by 1 is " + first + second + third + fourth + fifth + ".");
    }
}