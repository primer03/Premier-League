package team;

import java.io.FileWriter;
import java.io.IOException;

public class createfile {

    public createfile() {
    }

    public void createmath() {
        String team[] = { "AFC Bournemouth", "Arsenal", "Aston Villa",
                "Brentford", "Brighton & Hove Albion", "Chelsea", "Crystal Palace", "Everton", "Fulham",
                "Leeds United", "Leicester City", "Liverpool", "Manchester City", "Manchester United",
                "Newcastle United", "Nottingham Forest", "Southampton", "Tottenham Hotspur",
                "West Ham United", "Wolverhampton Wanderers" };
        int data[][] = { { 6, 1, 8, 11, 0, 2, 14, 15, 17, 16, 9, 19, 7, 5, 10, 3, 13, 4, 18, 12 },
                { 2, 7, 16, 9, 1, 10, 4, 14, 12, 0, 19, 8, 3, 13, 15, 18, 5, 17, 11, 6 },
                { 17, 19, 7, 15, 10, 16, 8, 3, 6, 2, 0, 1, 18, 4, 9, 5, 14, 12, 13, 11 },
                { 16, 13, 5, 10, 4, 9, 12, 6, 11, 0, 3, 7, 1, 8, 19, 14, 2, 18, 15, 17 },
                { 6, 3, 8, 4, 16, 5, 9, 7, 0, 19, 12, 15, 1, 2, 18, 17, 11, 14, 10, 13 },
                { 7, 11, 17, 8, 15, 0, 5, 18, 3, 9, 19, 16, 14, 6, 2, 12, 4, 10, 13, 1 },
                { 8, 5, 6, 13, 12, 17, 1, 7, 11, 19, 16, 3, 9, 15, 0, 4, 10, 2, 18, 14 },
                { 2, 16, 15, 8, 19, 12, 14, 0, 17, 10, 3, 1, 7, 18, 13, 9, 4, 6, 5, 11 },
                { 1, 17, 11, 4, 8, 14, 16, 7, 6, 5, 0, 3, 18, 19, 12, 13, 9, 2, 10, 15 },
                { 14, 3, 0, 10, 12, 16, 5, 19, 4, 17, 18, 8, 6, 9, 1, 11, 7, 13, 15, 2 },
                { 3, 4, 10, 6, 19, 15, 8, 0, 17, 7, 16, 18, 13, 14, 9, 1, 2, 5, 11, 12 },
                { 4, 15, 6, 19, 0, 16, 11, 18, 3, 5, 14, 7, 13, 17, 8, 2, 10, 9, 1, 12 },
                { 15, 11, 7, 6, 12, 4, 5, 13, 19, 10, 2, 3, 16, 1, 9, 8, 17, 14, 18, 0 },
                { 10, 12, 14, 2, 0, 17, 4, 5, 6, 16, 3, 19, 8, 7, 11, 9, 1, 15, 13, 18 },
                { 15, 3, 19, 4, 12, 8, 9, 0, 7, 10, 5, 1, 2, 13, 16, 14, 18, 6, 17, 11 },
                { 12, 3, 11, 16, 0, 7, 18, 10, 17, 9, 15, 6, 14, 5, 19, 1, 4, 2, 8, 13 },
                { 3, 17, 16, 4, 10, 14, 6, 8, 7, 19, 2, 11, 1, 18, 5, 0, 13, 15, 9, 12 },
                { 18, 3, 11, 10, 19, 13, 12, 7, 8, 16, 0, 6, 14, 9, 4, 1, 17, 2, 15, 5 },
                { 3, 11, 10, 8, 1, 14, 7, 4, 13, 0, 16, 15, 9, 18, 2, 19, 6, 17, 5, 12 },
                { 2, 9, 13, 12, 19, 18, 15, 10, 4, 11, 7, 16, 3, 0, 5, 6, 14, 8, 17, 1 },
                { 11, 5, 16, 2, 18, 7, 0, 15, 10, 4, 6, 14, 12, 19, 9, 3, 1, 13, 8, 17 },
                { 5, 8, 7, 1, 4, 0, 13, 6, 3, 16, 19, 11, 2, 10, 14, 18, 15, 9, 17, 12 },
                { 18, 5, 8, 15, 10, 17, 1, 3, 6, 4, 16, 19, 0, 14, 9, 13, 12, 2, 11, 7 },
                { 2, 1, 3, 6, 19, 0, 4, 8, 7, 9, 5, 16, 15, 12, 14, 11, 13, 10, 17, 18 },
                { 8, 19, 14, 4, 7, 2, 10, 1, 18, 15, 9, 16, 0, 12, 6, 11, 17, 5, 13, 3 },
                { 12, 14, 5, 9, 1, 0, 2, 6, 4, 18, 19, 17, 16, 10, 15, 7, 11, 13, 3, 8 },
                { 0, 11, 9, 4, 7, 3, 10, 5, 17, 15, 6, 12, 13, 16, 18, 2, 8, 1, 14, 19 },
                { 15, 14, 3, 10, 16, 17, 2, 0, 19, 9, 5, 7, 1, 6, 11, 8, 12, 18, 4, 13 },
                { 12, 11, 0, 8, 15, 19, 6, 10, 1, 9, 4, 3, 5, 2, 18, 16, 14, 13, 7, 17 },
                { 13, 7, 2, 15, 3, 14, 8, 18, 19, 5, 17, 4, 10, 0, 16, 12, 9, 6, 11, 1 },
                { 2, 14, 16, 6, 7, 8, 17, 0, 19, 3, 5, 4, 12, 10, 18, 1, 15, 13, 9, 11 },
                { 1, 16, 8, 9, 13, 5, 6, 7, 11, 15, 3, 2, 10, 19, 4, 12, 14, 17, 0, 18 },
                { 19, 6, 2, 8, 9, 10, 15, 4, 5, 3, 18, 11, 12, 1, 16, 0, 7, 14, 17, 13 },
                { 6, 18, 4, 19, 3, 15, 1, 5, 13, 2, 8, 12, 0, 9, 14, 16, 11, 17, 10, 7 },
                { 0, 5, 19, 2, 17, 6, 11, 3, 12, 9, 14, 1, 18, 13, 8, 10, 4, 7, 15, 16 },
                { 9, 14, 16, 8, 3, 18, 5, 15, 2, 17, 13, 19, 6, 0, 7, 12, 1, 4, 10, 11 },
                { 18, 9, 11, 2, 4, 16, 17, 3, 19, 7, 15, 1, 14, 10, 0, 13, 12, 5, 8, 6 },
                { 2, 4, 7, 0, 9, 17, 3, 12, 13, 8, 5, 14, 10, 18, 1, 19, 16, 11, 6, 15 } };

        FileWriter writer;
        try {
            writer = new FileWriter("data/Match.dat");
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {

                }
            }
            for (int i = 0; i < data.length; i++) {
                writer.write(team[data[i][0]] + "," + team[data[i][1]] + "|" +
                        team[data[i][2]] + "," + team[data[i][3]] + "|" +
                        team[data[i][4]] + "," + team[data[i][5]] + "|" +
                        team[data[i][6]] + "," + team[data[i][7]] + "|" +
                        team[data[i][8]] + "," + team[data[i][9]] + "|" +
                        team[data[i][10]] + "," + team[data[i][11]] + "|" +
                        team[data[i][12]] + "," + team[data[i][13]] + "|" +
                        team[data[i][14]] + "," + team[data[i][15]] + "|" +
                        team[data[i][16]] + "," + team[data[i][17]] + "|" +
                        team[data[i][18]] + "," + team[data[i][19]] + "|\n");
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
