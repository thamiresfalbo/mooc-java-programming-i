public class Team {
    private String name;
    private int wins;
    private int losses;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getWins() {
        return this.wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public int getGames() {
        return (getWins() + getLosses());
    }

    public void addWin() {
        this.wins++;
    }

    public void addLoss() {
        this.losses++;
    }

}
