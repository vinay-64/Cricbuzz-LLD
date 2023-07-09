package Observers;

import Inning.Ball;

public class BattingScoreObserver implements ScoreObserver {

    @Override
    public void update(Ball ball) {
        int runs=ball.runs;
        ball.playedBy.battingScoreCard.totalBallsPlayed+=1;
        ball.playedBy.battingScoreCard.totalRuns+=runs;
        if(runs==4){
            ball.playedBy.battingScoreCard.totalFours+=1;
        }
        else if(runs==6){
            ball.playedBy.battingScoreCard.totalSix+=1;
        }
    }
}
