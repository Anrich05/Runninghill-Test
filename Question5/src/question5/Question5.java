package question5;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Anrich
 */
public class Question5 {

   static void FindDuplicate(int[] duplicateNumberList){
       
       //Creating queue
       Queue<Integer> duplicates = new LinkedList<>();
       int duplicate = 0;
       
       for (int i = 0; i < duplicateNumberList.length ; i++) {
           
           for (int j = i + 1; j < duplicateNumberList.length ; j++) {
               
               //Checks to see if the two values are the same
               if (duplicateNumberList[i] == duplicateNumberList[j]) {
                   
                   //If this is true, it is added to the queue
                   duplicates.add(duplicateNumberList[j]) ;
                   
               }
               //If false, the loop continues
               else
                   continue;  
           } 
       }
       
       //Prints out what numbers are repeating
       System.out.println("The numbers that repeat are " + duplicates);
       
   }
    
    public static void main(String[] args) {
       
        //Declaring constant array
       final int[] duplicateNumberList = {1,4,3,4,5,7,7,8,9,10}; 
       
       //Calling method to see if there are any duplicates
       FindDuplicate(duplicateNumberList);
        
    }
    
}
