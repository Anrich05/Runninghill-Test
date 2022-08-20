package question7;

import java.util.Scanner;

/**
 *
 * @author Anrich
 */
public class Question7 {
    
    //We build this function to see if the message has punctuation is true or false
    public static boolean isPunctuation(char c) {
        return c == ','
            || c == '.'
            || c == '!'
            || c == '?'
            || c == ':'
            || c == ';'
            ;
    }

    //Function to decipher code
    static void DecipherCode(String message){
        
        //Created string to check through whole alphabet
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //turns message sent by user into an array to check character individually
        char[] msgsplit = message.toCharArray();
        //declare array that is length of the message 
        char[] truemessage = new char[msgsplit.length];
        //variable that is the size of the alphabet
        int SizeOfAlphabet = 26;
        int numofchar = 0;
        int truechar = 0;
        
        for (int i = 0; i < msgsplit.length; i++) {
            
            for (int j = 0; j < alphabet.length; j++) {
                
                //Checks to see if value is uppercase
                if (Character.isUpperCase(msgsplit[i])) {
                    
                    //if true, value is inserted into array
                    truemessage[i] = msgsplit[i];
                    
                    //Checks to see if the value is a whitespace
                }else if (Character.isWhitespace(msgsplit[i])) {
                    
                    //if true, value is inserted into array 
                    truemessage[i] = msgsplit[i];
                    
                     //Checks to see if the value is a punctuation
                }else if (isPunctuation(msgsplit[i])) {
                    
                    //if true, value is inserted into array
                    truemessage[i] = msgsplit[i];
                    
                    //Checks to see if value is equal to the value in the alphabet
                }else if (msgsplit[i] == alphabet[j]) {
                    
                    //If true, we start to decipher letter by letter
                    numofchar = j;
                    
                    //true value is the character on the opposite number
                    truechar = (SizeOfAlphabet - numofchar) - 1;
                    
                    //inserts true value into array
                    truemessage[i] = alphabet[truechar];
                    
                    
                }
                
            }
            
        }
        
        //Prints out the true message
        System.out.println(truemessage);
        
    }
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        //Asks user what the message was
        System.out.println("What did those minions say this time?");
       
        //message is stored into variable
        String message = input.nextLine();
        
        //Function is called to decipher message
        DecipherCode(message);
        
    }
    
}
