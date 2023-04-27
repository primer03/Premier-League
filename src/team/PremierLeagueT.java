package team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PremierLeagueT {

    private static final int NUM_TEAMS = 20;
    private static final int NUM_ROUNDS = 2 * (NUM_TEAMS - 1);
    private static final int NUM_MATCHES_PER_ROUND = NUM_TEAMS / 2;
    // private String[] team = { "AFC Bournemouth", "Arsenal", "Aston Villa",
    // "Brentford", "Brighton & Hove Albion",
    // "Chelsea", "Crystal Palace", "Everton", "Fulham", "Leeds United",
    // "Leicester City", "Liverpool", "Manchester City", "Manchester United",
    // "Newcastle United", "Nottingham Forest", "Southampton", "Tottenham Hotspur",
    // "West Ham United", "Wolverhampton Wanderers" };
    private String Mathteam[][] = new String[38][10];
    private List<String> teams;
    private String[] team = new String[20];

    public PremierLeagueT(String[] arrteam) {
        team = arrteam;
        this.teams = new ArrayList<>();
        for (int i = 0; i < team.length; i++) {
            teams.add(team[i]);
        }
    }

    public PremierLeagueT() {
        this.teams = new ArrayList<>();
        for (int i = 0; i < team.length; i++) {
            teams.add(team[i]);
        }
    }

    public void generateFixtures() {
        List<String> fixtures = new ArrayList<>();
        int numTeams = 20;
        int numRounds = 2 * (numTeams - 1);
        int numMatchesPerRound = numTeams / 2;
        List<String> teams = new ArrayList<>(Arrays.asList(
                "Arsenal", "Aston Villa", "Brentford", "Brighton", "Burnley",
                "Chelsea", "Crystal Palace", "Everton", "Leeds United", "Leicester City",
                "Liverpool", "Manchester City", "Manchester United", "Newcastle United", "Norwich City",
                "Southampton", "Tottenham Hotspur", "Watford", "West Ham United", "Wolverhampton Wanderers"));
        Collections.sort(teams); // Sort the list of teams
        if (numTeams % 2 != 0) {
            teams.add("BYE"); // Add a "bye" team if the number of teams is odd
            numTeams++;
        }
        int numGroups = numTeams / 2;
        List<String> groupA = new ArrayList<>(teams.subList(0, numGroups));
        List<String> groupB = new ArrayList<>(teams.subList(numGroups, numTeams));
        String[][] matches = new String[numRounds][numMatchesPerRound * 2];
        boolean isHomeFixture = true;
        for (int i = 0; i < numRounds; i++) {
            List<String> roundFixtures = new ArrayList<>();
            for (int j = 0; j < numMatchesPerRound; j++) {
                String homeTeam, awayTeam;
                int awayIndex = (numMatchesPerRound - 1 + j + i) % (numMatchesPerRound - 1);
                if (isHomeFixture) {
                    homeTeam = groupA.get(j);
                    awayTeam = groupB.get(awayIndex);
                } else {
                    homeTeam = groupB.get(awayIndex);
                    awayTeam = groupA.get(j);
                }
                roundFixtures.add(homeTeam + " vs " + awayTeam);
            }
            matches[i] = roundFixtures.toArray(new String[numMatchesPerRound * 2]);
            isHomeFixture = !isHomeFixture;
        }
        for (int i = 0; i < numRounds; i++) {
            System.out.println("Round " + (i + 1) + ":");
            for (int j = 0; j < numMatchesPerRound; j++) {
                System.out.println(matches[i][j]);
            }
        }
    }

    private void printFixtures(List<String> fixtures) {
        for (int i = 0; i < NUM_ROUNDS; i++) {
            System.out.println("Week " + (i + 1) + ":");
            for (int j = 0; j < NUM_MATCHES_PER_ROUND; j++) {
                System.out.println(fixtures.get(i * NUM_MATCHES_PER_ROUND + j));
            }
            System.out.println();
        }
    }

    public String[][] getMathteam() {
        return Mathteam;
    }

    // public static void main(String[] args) {
    // PremierLeague generator = new PremierLeague();
    // generator.generateFixtures();
    // }
}
