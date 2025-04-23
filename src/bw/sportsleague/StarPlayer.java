package bw.sportsleague;

public class StarPlayer extends Player {
    public StarPlayer(String name, int wins, int age) throws InvalidPlayerException {
        super(name, wins, age);
    }

    @Override
    public void displayPlayerInfo() {
        System.out.println("Star Player: " + getName() + " - Wins: " + getWins() + " - Age: " + getAge());
    }
}