package Inning;

import Team.Player.Player;
import Team.Team;

import java.util.ArrayList;
import java.util.List;

public class Over {
    int overNumber;
    List<Ball> balls;
    Player bowler;
    public Over(int overNumber, Player currentBowler) {
        this.overNumber=overNumber;
        bowler=currentBowler;
        balls=new ArrayList<>();
    }


    public boolean startOver(Team battingTeam, Team bowlingTeam, int target) {
        for(int i=1;i<=6;i++){
            Ball ball=new Ball(i);
            ball.startBallDelivery(battingTeam,bowlingTeam);
            balls.add(ball);
            if (ball.isWicket) {

                battingTeam.chooseNextBatsMan();
//                System.out.println("Choose Next .........."+battingTeam.battingController.getStriker()+" "+battingTeam.battingController.getNonStriker());
            }

            if (target != -1 && battingTeam.getTotalRuns() >= target) {
                battingTeam.isWinner = true;
                return true;
            }
        }
        return false;
    }
}
