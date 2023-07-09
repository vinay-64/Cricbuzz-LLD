package Observers;

import Inning.Ball;

public class BowlingScoreObserver implements ScoreObserver {
    @Override
    public void update(Ball ball) {
        if(ball.isWicket) ball.bowledBy.bowlingScoreCard.wicketsTaken+=1;
        else {
            ball.bowledBy.bowlingScoreCard.runsGiven += ball.runs;
//            int overs = ball.bowledBy.bowlingScoreCard.totalOversCount;
//            ball.bowledBy.bowlingScoreCard.totalOversCount=(int)((overs*6)+1)/6;
        }
    }
}
