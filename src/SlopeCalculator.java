public class SlopeCalculator
{
    /* this class contains no instance variables or constructors */

    public int sum(int x, int y)
    {
        return x + y;
    }

    public int difference(int x, int y)
    {
        return y - x;
    }

    public double slope(int x1, int y1, int x2, int y2)
    {
        int rise = difference(y1, y2);
        int run = difference(x1, x2);
        double slope = (double) rise / run;
        return slope;
    }

    public int square(int value)
    {
        value *= value;
        return value;
    }

    public double developerTest()
    {
        double numA = sum(4, 5) / difference(4, 6);
        // double numB = sum(4.0, 5.0) / 2;
        double numC = slope(4,  2 , 6, 7) + difference(3, 5);
        return numC;
    }
}
