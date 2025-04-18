//Team.java
package bw.sportsleague;

public class Team {
    private String teamName;
    private Player[] players;
    //Constructor    
    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    // Method to display team and player info
    public void displayTeamInfo() {
        System.out.printf("Team: " + teamName);
        for (Player p : players) {
            p.displayPlayerInfo();
        }
    }

    // Getter and Setter methods
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
