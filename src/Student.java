public class Student {
    /* Instance Variables */

    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;
    private double testAverage;

    /* Constructor; see note below */

    public Student(String firstName, String lastName, int gradYear)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0.0;
        testScoreCount = 0;
    }

    /* Methods */

    // Sets gradYear to newGradYear
    public void updateGradYear(int newGradYear)
    {
        gradYear = newGradYear;
    }

    // Adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    public void addTestScore(double newTestScore)
    {
        accumulatedTestScores = accumulatedTestScores + newTestScore;
        testScoreCount += 1;
    }

    // Returns the number of test scores that have been added
    public int getTestScoreCount()
    {
        return testScoreCount;
    }

    // Returns the Student’s average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore()
    {
         testAverage = accumulatedTestScores / testScoreCount;
         return testAverage;
    }

    // this method prints all info of a Student object to the console
    public void printStudentInfo()
    {
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        averageTestScore();
        System.out.println("Average Test Score: " + testAverage);
        System.out.println("Number of Tests Averaged: " + testScoreCount);
    }
}