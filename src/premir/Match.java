package premir;

import java.util.*;

public class Match {
    private String Teamhome;
    private String Teamaway;
    private int scorehome;
    private int scoreaway;

    

    public Match(String teamhome, String teamaway, int scorehome, int scoreaway) {
        Teamhome = teamhome;
        Teamaway = teamaway;
        this.scorehome = scorehome;
        this.scoreaway = scoreaway;
    }
    public String getTeamhome() {
        return Teamhome;
    }
    public void setTeamhome(String teamhome) {
        Teamhome = teamhome;
    }
    public String getTeamaway() {
        return Teamaway;
    }
    public void setTeamaway(String teamaway) {
        Teamaway = teamaway;
    }
    public int getScorehome() {
        return scorehome;
    }
    public void setScorehome(int scorehome) {
        this.scorehome = scorehome;
    }
    public int getScoreaway() {
        return scoreaway;
    }
    public void setScoreaway(int scoreaway) {
        this.scoreaway = scoreaway;
    }
    @Override
    public String toString() {
        return Teamhome + "," + Teamaway + "," + scorehome + ","+ scoreaway;
    }
}
