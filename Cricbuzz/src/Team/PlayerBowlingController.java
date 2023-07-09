package Team;

import Team.Player.Player;

import java.util.*;

public class PlayerBowlingController {

    Deque<Player> bowlersList;
    Map<Player, Integer> bowlerVsOverCount;
    Player currentBowler;

    public PlayerBowlingController(List<Player> bowlers) {
        setBowlersList(bowlers);
    }

    private void setBowlersList(List<Player> bowlersList) {
        this.bowlersList = new LinkedList<>();
        bowlerVsOverCount = new HashMap<>();
        for (Player bowler : bowlersList) {
            this.bowlersList.addLast(bowler);
            bowlerVsOverCount.put(bowler, 0);
        }
    }

    public void getNextBowler(int maxOverCountPerBowler) {

        Player playerDetails = bowlersList.poll();
        if(bowlerVsOverCount.get(playerDetails)+1 == maxOverCountPerBowler) {
            currentBowler = playerDetails;
        }
        else {
            currentBowler = playerDetails;
            bowlersList.addLast(playerDetails);
            bowlerVsOverCount.put(playerDetails, bowlerVsOverCount.get(playerDetails)+1);
        }
    }

    public Player getCurrentBowler(){
        return currentBowler;
    }
}
