// Player.java
package bw.sportsleague;

public abstract class Player{
    private String name;
    private int wins;
    private int age;
    //Constructor
    public Player(String name , int wins , int age)throws InvalidPlayerException {
        if (wins < 0) {
            throw new InvalidPlayerException("Wins cannot be negative: " + wins);
        }
        if (age < 0) {
            throw new InvalidPlayerException("Age cannot be negative: " + age);
        }
        this.name = name;
        this.wins = wins;
        this.age = age;
    }

    //Getter and Setter methods
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getWins(){
        return wins;
    }

    public void setWins(int wins){
        this.wins = wins;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}

