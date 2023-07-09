import Team.Player.Player;
import Team.Team;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main obj=new Main();
        Team A=obj.createTeam("INDIA");
        Team B=obj.createTeam("PAK");
        Match match=new Match(A,B);
        match.start();
    }

    private Team createTeam(String name) {
        Queue<Player> players=new LinkedList<>();
        List<Player> bowlers=new ArrayList<>();
        for(int i=0;i<11;i++){
            Player player= new Player(name+"Player "+(i+1),25+i,"Address "+(i+1));
            players.add(player);
            if(i>=7){
                bowlers.add(player);
            }
        }
        Team team = new Team(name,players,new ArrayList<>(), bowlers);
        return team;
    }
}