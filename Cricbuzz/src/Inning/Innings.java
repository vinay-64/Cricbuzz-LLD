package Inning;

import Team.Player.Player;
import Team.Team;

import java.util.ArrayList;
import java.util.List;

public class Innings {

    Team battingTeam;
    Team bowlingTeam;
    List<Over> overs;

    public Innings(Team battingTeam, Team bowlingTeam, int numOfOvers) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        overs=new ArrayList<>(numOfOvers);
    }

    public void start(int target) {
        battingTeam.chooseNextBatsMan();
        for(int overNumber=1;overNumber<=20;overNumber++){
//            Player batter = battingTeam.getNextBatter();
            bowlingTeam.chooseNextBowler(20);
            Over currentOver=new Over(overNumber,bowlingTeam.getCurrentBowler());
            overs.add(currentOver);
            boolean won = currentOver.startOver(battingTeam, bowlingTeam, target);
            if (won == true) {
                break;
            }
//            currentOver.startOver(battingTeam,bowlingTeam);
            Player temp = battingTeam.getStriker();
            battingTeam.setStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);
        }
    }

    public int getTotalRuns() {
        return battingTeam.getTotalRuns();
    }
}
