// Player.java
package bw.sportsleague;

public abstract class Player{
    private String name;
    private int wins;
    private int age;

    public Player(String name , int wins , int age){
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

