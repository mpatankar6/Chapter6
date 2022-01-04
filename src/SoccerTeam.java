public class SoccerTeam {

    private int wins;
    private int losses;
    private int ties;
    private static int totalGames;
    private static int totalGoals;

    public SoccerTeam() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore) {
        totalGoals += (myScore + otherScore);
        totalGames += 1;

        if (myScore > otherScore) {
            this.wins += 1;
            other.losses += 1;
        } else if (otherScore > myScore) {
            this.losses += 1;
            other.wins += 0;
        } else {
            this.ties += 1;
            other.ties += 1;
        }
    }

    public int getTotalPoints() {
        return wins*3 + ties;
    }

    public static int getTotalGames() {
        return totalGames;
    }

    public static int getTotalGoals() {
        return totalGoals;
    }

    public static void startTournament() {
        totalGames = 0;
        totalGoals = 0;
    }

    public void reset() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public static void main(String[] args) {
        SoccerTeam team1 = new SoccerTeam();
        SoccerTeam team2 = new SoccerTeam();
        SoccerTeam team3 = new SoccerTeam();
        SoccerTeam team4 = new SoccerTeam();

        startTournament();
        team1.played(team2, 2, 1);
        team2.played(team3, 0, 1);
        team3.played(team4, 3, 2);
        team4.played(team1, 12, 0);
        System.out.println("Team 1: " + team1.getTotalPoints());
        System.out.println("Team 2: " + team2.getTotalPoints());
        System.out.println("Team 3: " + team3.getTotalPoints());
        System.out.println("Team 4: " + team4.getTotalPoints());
        System.out.println("Total Games Played: " + getTotalGames());
        System.out.println("Total Goals Scored: " + getTotalGoals());
        team1.reset();
        team2.reset();
        team3.reset();
        team4.reset();
        startTournament();
        team1.played(team2, 1, 3);
        team2.played(team3, 2, 3);
        team3.played(team4, 1, 3);
        team4.played(team1, 0, 0);
        System.out.println("Team 1: " + team1.getTotalPoints());
        System.out.println("Team 2: " + team2.getTotalPoints());
        System.out.println("Team 3: " + team3.getTotalPoints());
        System.out.println("Team 4: " + team4.getTotalPoints());
        System.out.println("Total Games Played: " + getTotalGames());
        System.out.println("Total Goals Scored: " + getTotalGoals());
    }

}

/** Output:
 *
 */