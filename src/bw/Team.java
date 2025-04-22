//Team.java
package bw.sportsleague;

public class Team {
    private String teamName;
    private Player[] players;
    private String kitColour;
    //Constructor    
    public Team(String teamName, Player[] players, String kitColour) {
        this.teamName = teamName;
        this.players = players;
        this.kitColour = kitColour;
    }

    // Method to display team and player info
    public void displayTeamInfo() {
        System.out.printf("Team: " + teamName + "kitColour: " + kitColour);
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
    public String getKitColour(){
        return kitColour;
    }
    public void setKitColour( String kitColour) {
        this.kitColour =kitColour;
    }
}
