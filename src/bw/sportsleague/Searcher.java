package bw.sportsleague;

public class Searcher {
    //Binary Search for Player[] by Age
    public static int binarySearch(Player[] arr, int targetAge) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid].getAge() == targetAge) {
        return mid;
        } else if (arr[mid].getAge() < targetAge) {
        low = mid + 1;
        } else {
        high = mid - 1;
        }
        }
        return -1;
    }

    public static int linearSearchByName(Player[] players, String targetName) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getName().equalsIgnoreCase(targetName)) {
                return i;
            }
        }
        return -1;
    }

    //  Linear search by teamName
    public static int linearSearchTeam(Team[] arr, String targetName) { 
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i].getTeamName().equals(targetName)) { 
                return i; 
            } 
        } 
        return -1; 
    } 
}
    

