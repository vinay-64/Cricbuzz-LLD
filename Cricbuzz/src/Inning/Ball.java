package Inning;

import Observers.BattingScoreObserver;
import Observers.BowlingScoreObserver;
import Observers.ScoreObserver;
import Team.Player.Player;

import java.util.List;
import java.util.Observer;

public class Ball {

    int ballNumber;
    Player playedBy;
    Player bowledBy;
    int runs;

    List<ScoreObserver> observers;

    public void getAllScoreObservers(){
        this.observers.add(new BattingScoreObserver());
        this.observers.add(new BowlingScoreObserver());
    }

}

