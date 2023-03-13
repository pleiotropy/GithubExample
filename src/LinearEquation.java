public class LinearEquation
{
    // Instance Variables
    private int x1, y1;
    private int x2, y2;
    private double x3, y3;

    // Constructor
    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Class Methods
    // Calculations
    public double distance()
    {
        // calculate distance between the points
        double distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        distance = Math.round(distance * 100);
        distance /= 100;
        return distance;
    }

    public double slope()
    {
        // calculate slope between the points
        return (y2-y1)/(x2-x1);
    }

    public double yIntercept()
    {
        // calculate the y-intercept
        return y1 - ((slope()) * x1);
    }

    public void calculateY3(double x3)
    {
        // calculate y3
        this.x3 = x3;
        y3 = (slope() * x3) + yIntercept();
    }

    // Printing things methods
    // To String Method
    public String toString()
    {
        String str = "First pair: (" + x1 + ", " + y1 + ")";
        str += "\nSecond pair: (" + x2 + ", " + y2 + ")";
        str += "\nSlope of line: " + slope();
        str += "\nY-intercept: " + yIntercept();
        str += "\nSlope intercept form: " + slopeInterceptForm();
        str += "\nDistance between points: " + distance();
        return str;
    }

    // Print slope intercept form
    public String slopeInterceptForm()
    {
        // print string that represents linear equation in y=mx+b form
        String rise = "" + (y2 - y1);
        String run = "" + (x2 - x1);
        return "y = " + rise + "/" + run + "x + " + yIntercept();
    }

    // Print solved coordinate point
    public String solvedPoint()
    {
        // print string that represents (x3, y3)
        return "(" + x3 + ", "+ y3 + ")";
    }
}
