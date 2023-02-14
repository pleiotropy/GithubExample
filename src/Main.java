import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Create new scanner object
        Scanner s = new Scanner(System.in);

        // Prompt user for their name
        System.out.print("Please enter your name: ");

        // Get input and store in a variable
        String name = s.nextLine();

        // Prompt user for their age
        System.out.print("Please enter your age: ");

        // Get input and store in a variable as an integer
        int x = s.nextInt();
    }
}