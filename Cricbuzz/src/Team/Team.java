package Team;

import Team.Player.Player;

import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class Team {

    public String teamName;
    public Queue<Player> players;
    public List<Player> bench;

    public PlayerBattingController battingController;
    public PlayerBowlingController bowlingController;
    public boolean isWinner;




    public Queue<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Queue<Player> players) {
        this.players = players;
    }

    public Team(String teamName, Queue<Player> players, List<Player> bench, List<Player> bowlers) {
        this.teamName = teamName;
        this.players = players;
        this.bench = bench;
        battingController=new PlayerBattingController(players);
        bowlingController=new PlayerBowlingController(bowlers);
    }

    public String getTeamName() {
        return teamName;
    }

    public void chooseNextBatsMan(){
        battingController.getNextPlayer();
    }

    public void chooseNextBowler(int maxOverCountPerBowler) {
        bowlingController.getNextBowler(maxOverCountPerBowler);
    }

    public Player getStriker() {
        return battingController.getStriker();
    }

    public Player getNonStriker() {
        return battingController.getNonStriker();
    }

    public void setStriker(Player player) {
        battingController.setStriker(player);
    }

    public void setNonStriker(Player player) {
        battingController.setNonStriker(player);
    }

    public Player getCurrentBowler() {
        return bowlingController.getCurrentBowler();
    }


//    public void printBowlingScoreCard() {
//
//        for (Player playerDetails : players) {
//            if (playerDetails.bowlingScoreCard.totalOversCount > 0) {
//                playerDetails.printBowlingScoreCard();
//            }
//        }
//    }

    public int getTotalRuns() {
        int totalRun = 0;
        for (Player player : players) {

            totalRun += player.battingScoreCard.totalRuns;
        }
        return totalRun;
    }
}
