package Team.Player.ScoreCard;

public class BattingScoreCard {
    public int totalRuns;
    public int totalBallsPlayed;
    public int totalFours;
    public int totalSix;

    @Override
    public String toString() {
        return "BattingScoreCard{" +
                "totalRuns=" + totalRuns +
                ", totalBallsPlayed=" + totalBallsPlayed +
                ", totalFours=" + totalFours +
                ", totalSix=" + totalSix +
                '}';
    }
}
