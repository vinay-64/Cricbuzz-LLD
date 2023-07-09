package Inning;

import Observers.BattingScoreObserver;
import Observers.BowlingScoreObserver;
import Observers.ScoreObserver;
import Team.Player.Player;
import Team.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Ball {

    public int ballNumber;
    public Player playedBy;
    public Player bowledBy;
    public int runs;

    public boolean isWicket;

    public List<ScoreObserver> observers;

//    @Override
//    public String toString() {
//        return "Ball{" +
//                "ballNumber=" + ballNumber +
//                ", playedBy=" + playedBy +
//                ", bowledBy=" + bowledBy +
//                ", runs=" + runs +
//                ", isWicket=" + isWicket +
//                ", observers=" + observers +
//                '}';
//    }

    public Ball(int i) {
        ballNumber=i;
        observers=new ArrayList<>();
        observers.add(new BattingScoreObserver());
        observers.add(new BowlingScoreObserver());
    }

    public void getAllScoreObservers(){
        this.observers.add(new BattingScoreObserver());
        this.observers.add(new BowlingScoreObserver());
    }

    public void startBallDelivery(Team battingTeam, Team bowlingTeam) {
        playedBy=battingTeam.getStriker();
        bowledBy=bowlingTeam.getCurrentBowler();

        if(isWicket()){
            battingTeam.setStriker(null);
            isWicket=true;
            this.runs=0;
        }
        else{
            int runs = getRun();
            this.runs=runs;
            if (runs == 1 || runs==3) {
                Player temp = battingTeam.getStriker();
                battingTeam.setStriker(battingTeam.getNonStriker());
                battingTeam.setNonStriker(temp);
            }
        }
        notifyAllPlayers();
    }

    private void notifyAllPlayers() {
        for(ScoreObserver observer: observers){
//            System.out.println(this);
            observer.update(this);

        }
    }

    private int getRun() {
        double val=Math.random();
        if (val <= 0.2) {
            return 1;
        } else if (val >= 0.3 && val <= 0.5) {
            return 2;
        } else if (val >= 0.6 && val <= 0.8) {
            return 4;
        } else {
            return 6;
        }
    }

    private boolean isWicket() {
        if(Math.random()<0.05) return true;
        return false;
    }
}

