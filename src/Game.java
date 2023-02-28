public class Game
{
    private int players;
    private int score;
    private boolean gameOver;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }

    /** Add the getScore() "getter" method here */
    public int getScore()
    {
        return score;
    }

    /** Add the addPlayer() method here */
    public void addPlayer()
    {
        players += 1;
    }

    /** Add the increaseScore(int increase) method here */
    public void increaseScore(int increase)
    {
        score = score + increase;
    }

    /** Add the averageScorePerPlayer() method here */
    public double averageScorePerPlayer()
    {
        double ave = (double) score / players;
        return ave;
    }

    public void end()
    {
        gameOver = true;
    }
}
