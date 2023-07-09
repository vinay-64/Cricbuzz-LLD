import Inning.Innings;
import Team.Player.Player;
import Team.Team;

public class Match {

    Team A;
    Team B;

    Innings[] innings;
    Team tossWinner;

    public Match(Team a, Team b) {
        A = a;
        B = b;
        innings=new Innings[2];
    }

    public void start() {
        int tossResult= toss();
//        this.tossWinner=(tossResult==0) ? A:B;
        for(int i=1;i<=2;i++){

            Innings inning;
            Team bowlingTeam;
            Team battingTeam;

            if(i==1){
                battingTeam=(tossResult==0) ? A:B;;
                bowlingTeam = (tossResult==0) ? B:A;
                inning=new Innings(battingTeam,bowlingTeam,20);
                inning.start(-1);
            }
            else {
                battingTeam=(tossResult==1) ? A:B;;
                bowlingTeam = ( tossResult==1) ? B:A;
                inning = new Innings(battingTeam, bowlingTeam,20);
                inning.start(innings[0].getTotalRuns());
                if (bowlingTeam.getTotalRuns() > battingTeam.getTotalRuns()) {
                    bowlingTeam.isWinner = true;
                }
            }
            innings[i - 1] = inning;
            System.out.println("******************************************************************");
            for (Player player: battingTeam.getPlayers()) {
                System.out.println(player);
            }
            System.out.println("-------------------------------------------------------------------");
            for (Player player: bowlingTeam.getPlayers()) {
                System.out.println(player);
            }
            System.out.println(battingTeam.getTeamName()+" "+battingTeam.getTotalRuns());
            System.out.println("******************************************************************");
        }


    }

    private int toss() {
        if (Math.random() <= 0.5) {
            return 0;
        } else {
            return 1;
        }
    }
}
