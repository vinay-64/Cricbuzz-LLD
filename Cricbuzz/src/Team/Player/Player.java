package Team.Player;

import Team.Player.ScoreCard.BattingScoreCard;
import Team.Player.ScoreCard.BowlingScoreCard;

public class Player {
    public String name;
    public int age;
    public  String address;

    public BattingScoreCard battingScoreCard;
    public BowlingScoreCard bowlingScoreCard;

    public Player(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        battingScoreCard=new BattingScoreCard();
        bowlingScoreCard=new BowlingScoreCard();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", battingScoreCard=" + battingScoreCard +
                ", bowlingScoreCard=" + bowlingScoreCard +
                '}';
    }

    public void printBattingScoreCard() {
    }

    public void printBowlingScoreCard() {
    }
}
