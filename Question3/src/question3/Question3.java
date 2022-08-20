
package question3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anrich
 */
public class Question3 {

    static Boolean Anagram(String a, String b){
        
        //If the values have te same length, the testing can commence
        if (a.length() == b.length()) {
            
            //converts to lowercase to have accurate results
            a = a.toLowerCase();
            b = b.toLowerCase();
            
            //converts string to char Array
            char[] arrayA = a.toCharArray();
            char[] arrayB = b.toCharArray();
            
            //sort both arrays to test if they are similiar
            Arrays.sort(arrayA);
             Arrays.sort(arrayB);
             
             if (Arrays.equals(arrayA,arrayB)) {
                 
                 return true;
                
            }
            else
                 return false;
            
        }
        else
            //values are not the same size, so cannot be anagams
            return false;
        
    }
    
    public static void main(String[] args) {
        
        String a = "";
        String b = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the first word");
        
        a = input.nextLine();
        
        System.out.println("Please enter the second word");
        
        b = input.nextLine();
        
        boolean answer = Anagram(a,b);
        
        if (answer == true) {
            
            System.out.println(a + " " + "and " + b + " are anagrams");
            
        }
        else
            System.out.println(a + " " + "and " + b + " are not anagrams");
        
        
        
    }
    
}
