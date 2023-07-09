package Team.Player.ScoreCard;

public class BowlingScoreCard {
//    public int totalOversCount;
    public int runsGiven;
    public int wicketsTaken;

    @Override
    public String toString() {
        return "BowlingScoreCard{" +
                "runsGiven=" + runsGiven +
                ", wicketsTaken=" + wicketsTaken +
                '}';
    }
}
