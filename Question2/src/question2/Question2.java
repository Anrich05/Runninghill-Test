package question2;

/**
 *
 * @author Anrich
 */
public class Question2 {
    
    static String Seperate(String message){
        
        // Replaces all the JavaScripts in te sentences with the chosen word
        String replace = message.replaceAll("JavaScript", "javascript");
        
        //Dot is a special character and needs to be helped with backslashes
        String[] sentence = replace.split("\\.");
        String msg = "";
        
        //for loop to assign array values to variable to display
        for (int i = 0; i < sentence.length; i++) {
            
            
            msg += sentence[i] + "." + "\n";
            
        }
        
        //returns message to main 
        return msg;
        
    }

   
    public static void main(String[] args) {
        
        //Declaring variable for use of replace and assign to array
       String message = "Lodashis a JavaScript library that helps programmers write more concise and maintainable" +
                            "JavaScript. It can be broken down into several mainareas: Utilities - for simplifying common" +
                            "programming tasks such as determining type as well as simplifying mathoperations.";
       
       //Asigns function to variable
      String msg = Seperate(message); 
      
        // displays the output
        System.out.println(msg);
      
    }
    
}
