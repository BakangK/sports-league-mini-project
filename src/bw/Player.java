// Player.java
package bw.sportsleague;

public abstract class Player{
    private String name;
    private int wins;
    private int age;
    //Constructor
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
     public static void selectionSort(Player[] arr) { 
        for (int i = 0; i < arr.length - 1; i++) { 
            int minIndex = i; 
            for (int j = i + 1; j < arr.length; j++) { 
                
                if (arr[j].getWins() < arr[minIndex].getWins()) { 
                    minIndex = j; 
                } 
            } 
            
        Player temp = arr[i]; 
            arr[i] = arr[minIndex]; 
            arr[minIndex] = temp; 
        } 
    }  
    public static void insertionSort(Player [] arr) { 
            for (int i = 1; i < arr.length; i++) { 
                Player key = arr[i]; 
                int j = i - 1; 
     
            
                while (j >= 0 && arr[j].getAge() > key.getAge()) { 
                    arr[j + 1] = arr[j]; 
                    j--; 
                } 
                arr[j + 1] = key; 
            } 
        }
    }    



