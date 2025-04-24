/*
 * How to compile : javac -d . src/bw/sportsleague/*.java
 * How to run : java bw.sportsleague.MainApp
*/
package bw.sportsleague;
import java.util.Array;
public class MainApp {
    public static void main(String[] args) {
        try {
            // Creating an array that stores StarPlayer objects
            Player[] players = new Player[]{
                new StarPlayer("Farhan", 5, 29),
                new StarPlayer("Alice", 1, 19),
                new StarPlayer("Sam", 3, 21),
                new StarPlayer("Simon", 9, 25),
                new StarPlayer("Luis", 11, 27),
                new StarPlayer("Khan", 6, 22)
            };
            //Creating some teams
            Team[] teams = new Team[] {
                new Team("Lions", players, "Blue"),
                new Team("Tigers", players, "Red"),
                new Team("Bears" , players,"Brown")
            };

            // Display Original Array
            System.out.println("Before sorting by wins:");
            for (Player p : players) {
                p.displayPlayerInfo();
            }

            // Sorting players by wins using selection sort
            Sorter.selectionSort(players);

            // Display players again after sorting by wins
            System.out.println("\nAfter sorting by wins:");
            for (Player p : players) {
                p.displayPlayerInfo();
            }

            // Sorting players by age using insertion sort
            Sorter.insertionSort(players);

            // Display players after sorting by age
            System.out.println("\nAfter sorting by age:");
            for (Player p : players) {
                p.displayPlayerInfo();
            }

            // Binary Search for a player by age ( e.g. searching for age a player with age of 29)
            int searchAge = 29;
            System.out.println( "\nSearching for a player with an age of : " + searchAge );
            int index = Searcher.binarySearch(players, searchAge);
            if (index != -1) {
                System.out.println("Player found: " + players[index].getName());
            } else {
                System.out.println("Player not found");
            }

            // Linear search for a player by name  
            String searchName = "Alice";
            System.out.println("\nSearching for a player : " + searchName);
            int foundIndex = Searcher.linearSearchByName(players, searchName);
            if (foundIndex != -1) {
                System.out.println("Player '" + searchName + "' found at index: " + foundIndex);
                players[foundIndex].displayPlayerInfo();
            } else {
                System.out.println("\nPlayer '" + searchName + "' not found.");
            }

            //  Searching a team
            String searchTeam = "Lions";
            System.out.println("\nSearching a team: " + searchTeam);
            int teamIndex = Searcher.linearSearchTeam(teams, searchTeam); // You should have this method in Searcher class

            if (teamIndex != -1) {
                System.out.println("\nTeam '" + searchTeam + "' found at index: " + teamIndex);
                teams[teamIndex].displayTeamInfo();
            } else {
                System.out.println("\nTeam '" + searchTeam + "' not found.");
            }

        } catch (InvalidPlayerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

