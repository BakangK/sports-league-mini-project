package bw.sportsleague;

public class Sorter{
    //doing insertion sort using age 
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

    //doing a selection sort using wins
    public static void selectionSort(Player[] arr) { 
        for (int i = 0; i < arr.length - 1; i++) { 
            int minIndex = i; 
            for (int j = i + 1; j < arr.length; j++) { 
                
                if (arr[j].getWins() < arr[minIndex].getWins()) { 
                    minIndex = j; 
                } 
            } 
          //swap  
        Player temp = arr[i]; 
            arr[i] = arr[minIndex]; 
            arr[minIndex] = temp; 
        } 
    }
}
