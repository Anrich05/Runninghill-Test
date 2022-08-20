package question6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Anrich
 */
public class Question6 {

    //Method to find lowest number in range
    static int FindLowest(int[] statsNumberList){
        
        //Make variable equal to highest value
        int Lowest = Integer.MAX_VALUE;
        
        for (int i = 0; i < statsNumberList.length ; i++) {
            
            //if value is smaller than the lowest value, it gets replaced
            if (statsNumberList[i] < Lowest) {
                
                //Newest lowest value
                Lowest = statsNumberList[i];
            
        }
         //Continues if not true
         else
                continue;   
        }
        //Returns lowest value
        return Lowest;
 
    }
    
    //Method to find highest number in range
    static int FindHighest(int[] statsNumberList){
        
        //Make variable equal to lowest value
        int Highest = Integer.MIN_VALUE;
        
        for (int i = 0; i < statsNumberList.length ; i++) {
            
             //if value is bigger than the ighest value, it gets replaced
            if (statsNumberList[i] > Highest) {
                
                //Newest highest value
                Highest = statsNumberList[i];
            
        }
         //Continues if not true
         else
                continue;   
        }
        //Returns lowest value
        return Highest;
        
    }
    
    //Method to find median of range
    static int FindMedian(int[] statsNumberList ){
        
        int[] sortArray = statsNumberList;
        int sizeofarray = statsNumberList.length;
        int num1 = 0,num2 = 0;
        int Median = 0;
        int half;
        int posneg;
        
        //Sorts array
        Arrays.sort(sortArray);
        
        //receive half of array
        half = sizeofarray/2;
        
        //receive remainder
        posneg = sizeofarray%2;
        
        //Checks to see if remainder equals to 0
        if ((posneg == 0)) {
            
            
           num1 = sortArray[half - 1];
            num2 = sortArray[half];
            
            //Numbers are multiplied and devided to receive Median
            Median = (num1 + num2)/2;
            
        }
        //Checks to see if remainder equals to 1
        else if (posneg == 1) {
            
            //Median equals front and back being equal and middle being alone
             Median = half +1;
            
            Median = sortArray[Median];
            
        }
        //Returns the Median
        return Median;
 
    }
    
    static int FindMode(int[] statsNumberList){
        
        int[] sortArray = statsNumberList;
       Queue<Integer> Mode = new LinkedList<>();
        int count = 0;
        int max_count = 0;
        
        Arrays.sort(sortArray);
        
        for (int i = 1; i < sortArray.length ; i++) {
            
            if (sortArray[i] == sortArray[i - 1]) {
                
                count++;
                Mode.add(sortArray[i]);
                
            }
            else
                if (count == max_count) {
                    
                    
                
            }
        }
        return 0; 
    }

    static void Display(int[] statsNumberList){
        
        //All variables are equal to the Methods
         int lowest = FindLowest(statsNumberList);
         int highest = FindHighest(statsNumberList);
         int median = FindMedian(statsNumberList);
         int mode = FindMode(statsNumberList);
         
         //Displays all the required values
         System.out.println("The lowest number is: " + lowest);
         System.out.println("The highest number is: " + highest);
         System.out.println("The median is: " + median);
         System.out.println("The mode is: " + mode);
    }
    
    public static void main(String[] args) {
       
        //Declaration of constant array
        final int[] statsNumberList = {1,4,3,4,5,7,7,8,9,10};
        
        //Calls Method that displays answers
        Display(statsNumberList);
        
    }
    
}
