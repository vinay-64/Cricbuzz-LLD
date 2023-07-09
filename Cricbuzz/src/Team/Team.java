package Team;

import Team.Player.Player;

import java.util.List;
import java.util.Queue;

public class Team {

    String teamName;
    Queue<Player> players;
    List<Player> bench;

    public PlayerBattingController battingController;
    public PlayerBowlingController bowlingController;
    public boolean isWinner;

}
