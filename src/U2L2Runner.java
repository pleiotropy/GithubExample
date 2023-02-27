public class U2L2Runner {
    public static void main(String[] args)
    {
        // 1. Create the following three Rectangle objects
        Rectangle actualRectangle = new Rectangle(150, 200);
        Rectangle square = new Rectangle(100);
        Rectangle defaultRectangle = new Rectangle();

        // 2. update all three rectangle widths to be 125
        actualRectangle.setWidth(125);
        square.setWidth(125);
        square.setLength(125);
        defaultRectangle.setWidth(125);

        // 3. Calculate how many total feet of fencing will be needed
        int totalPerimeter;
        totalPerimeter = actualRectangle.calculatePerimeter() + square.calculatePerimeter() + defaultRectangle.calculatePerimeter();
        System.out.println("The total feet of fencing needed is " + totalPerimeter + " feet.");

        /* OLD
        int actualRectanglePerimeter;
        int squarePerimeter;
        int defaultRectanglePerimeter;
        int totalPerimeter;
        actualRectanglePerimeter = 2 * (actualRectangle.getLength() + actualRectangle.getWidth());
        squarePerimeter = 4 * (square.getLength());
        defaultRectanglePerimeter = 2 * (defaultRectangle.getLength() + defaultRectangle.getWidth());
        totalPerimeter = actualRectanglePerimeter + squarePerimeter + defaultRectanglePerimeter;
        System.out.println("The total feet of fencing needed is " + totalPerimeter + " feet.");
        */

        // 4. Calculate how many total square feet of grass seed will be needed
        int totalArea;
        totalArea = actualRectangle.calculateArea() + square.calculateArea() + defaultRectangle.calculateArea();
        System.out.println("The total square feet of grass seed needed is " + totalArea + " square feet.");

        // Construction Pricer
        // 1. Ask how many boards of lumber they need, how many windows they need, and the tax rate for their area (e.g. 8% = 0.08)

    }
}
