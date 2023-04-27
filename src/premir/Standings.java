package premir;

public class Standings implements Comparable<Standings> {
    private String team;
    private int position;
    private int points;
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int goalsFor;
    private int goalsAgainst;
    private int goalsScored;
    private int goalsConceded;

    public Standings(String team, int position, int points, int played, int won, int drawn, int lost, int goalsFor,
            int goalsAgainst, int goalsScored, int goalsConceded) {
        this.team = team;
        this.position = position;
        this.points = points;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
    }

    public String getTeam() {
        return team;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDrawn() {
        return drawn;
    }

    public void setDrawn(int drawn) {
        this.drawn = drawn;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int compareTo(Standings other) {
        if (this.points != other.points) {
            return other.points - this.points;
        } else if (this.getGoalDifference() != other.getGoalDifference()) {
            return other.getGoalDifference() - this.getGoalDifference();
        } else if (this.goalsFor != other.goalsFor) {
            return other.goalsFor - this.goalsFor;
        } else {
            return this.team.compareTo(other.team);
        }
    }
    

    public int getGoalDifference() {
        return goalsScored - goalsConceded;
    }

    @Override
    public String toString() {
        return String.format("%-3d %-20s %2d %2d %2d %2d %2d %2d %3d %3d %3d %3d",
                position, team, played, won, drawn, lost, goalsFor, goalsAgainst, getGoalDifference(), points);
    }
}
