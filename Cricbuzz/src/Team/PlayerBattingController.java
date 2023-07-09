package Team;

import Team.Player.Player;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerBattingController {
    Queue<Player> yetToPlay;
    Player striker;
    Player nonStriker;

    public PlayerBattingController(Queue<Player> players) {
        this.yetToPlay = new LinkedList<>();
        this.yetToPlay.addAll(players);
    }

    public void getNextPlayer() {


        if (striker == null) {
            striker = yetToPlay.poll();
        }

        if (nonStriker == null) {
            nonStriker = yetToPlay.poll();
        }
    }

    public Player getStriker() {
        return striker;
    }

    public Player getNonStriker() {
        return nonStriker;
    }

    public void setStriker(Player playerDetails) {
        striker = playerDetails;
    }

    public void setNonStriker(Player playerDetails) {
        nonStriker = playerDetails;
    }

}
