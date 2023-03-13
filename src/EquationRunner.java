import java.util.Scanner;
public class EquationRunner
    {
        public static void main(String[] args)
        {
            // Welcome and Get coordinate points
            System.out.println("Welcome to the experience of calculating linear equations!");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first (x,y) coordinate point: ");
            String point1 = s.nextLine();
            System.out.println("Enter the second (x,y) coordinate point: ");
            String point2 = s.nextLine();

            // User String methods to get ints from the Strings
            // Get the index of the commas
            int c1 = point1.indexOf(",");
            int c2 = point2.indexOf(",");

            // x point will always start at index 1
            // x point will always end at the index of the comma, minus 1
            int x1 = Integer.parseInt(point1.substring(1, c1));
            int x2 = Integer.parseInt(point2.substring(1, c2));

            // y point will always start at the index of the comma, plus 2
            // y point will always end at the length of the string minus 2
            int y1 = Integer.parseInt(point1.substring(c1+1, point1.length()-1));
            int y2 = Integer.parseInt(point2.substring(c2+1, point2.length()-1));

            // Create the object using the ints
            LinearEquation eq = new LinearEquation(x1, y1, x2, y2);

            // Calculate, display slope, y-intercept, and distance
            eq.slope();
            eq.yIntercept();
            eq.distance();

            // Display information
            System.out.println(eq);

            // Get third x-value
            System.out.println("Enter an x-value: ");
            double x3 = s.nextDouble();

            // Calculate, display (x3, y3)
            eq.calculateY3(x3);
            System.out.println("Solved coordinate point is: " + eq.solvedPoint());
        }
    }
