package premir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PremierLeagueSchedule {
    private static final int NUM_TEAMS = 20;
    private static final int NUM_MATCHES = 38;
 
    private String[] teams;
    private String[][] schedule;
 
    public PremierLeagueSchedule(String[] teamNames) {
       if (teamNames.length != NUM_TEAMS) {
          throw new IllegalArgumentException("Invalid number of teams");
       }
       teams = teamNames.clone();
       schedule = new String[NUM_MATCHES][2];
       generateSchedule();
    }
 
    public void printSchedule() {
       System.out.println("Premier League Schedule:");
       for (int i = 0; i < schedule.length; i++) {
          String homeTeam = schedule[i][0];
          String awayTeam = schedule[i][1];
          System.out.printf("Match %2d: %s vs. %s\n", i+1, homeTeam, awayTeam);
       }
    }
 
    private void generateSchedule() {
       List<String> teamList = new ArrayList<String>(Arrays.asList(teams));
       Collections.shuffle(teamList);
       int mid = NUM_TEAMS / 2;
       List<String> firstHalf = teamList.subList(0, mid);
       List<String> secondHalf = teamList.subList(mid, NUM_TEAMS);
       for (int i = 0; i < NUM_MATCHES; i++) {
          if (i % 2 == 0) {
             schedule[i][0] = firstHalf.get(i/2);
             schedule[i][1] = secondHalf.get(i/2);
          } else {
             schedule[i][0] = secondHalf.get(i/2);
             schedule[i][1] = firstHalf.get(i/2);
          }
       }
    }
 
    public static void main(String[] args) {
       String[] teams = {
          "Arsenal", "Aston Villa", "Brentford", "Brighton", "Burnley",
          "Chelsea", "Crystal Palace", "Everton", "Leeds United", "Leicester City",
          "Liverpool", "Manchester City", "Manchester United", "Newcastle United", "Norwich City",
          "Southampton", "Tottenham Hotspur", "Watford", "West Ham United", "Wolverhampton Wanderers"
       };
       PremierLeagueSchedule schedule = new PremierLeagueSchedule(teams);
       schedule.printSchedule();
    }
 }
 