package question1;
/**
 *
 * @author Anrich
 */
public class Question1 {

    static void Remove(String message){
        
        // Split words to be able to focus on words one for one
        String[] msg = message.split(" ");
        
        String new_msg = "";
        
        for (int i = msg.length - 1; i > -1 ; i--) {
            
            //If value is equal, it gets skipped in new message
            if (msg[i].equals("is")) {
                
               continue;
               
             //If value is equal, it gets skipped in new message
           }else if (msg[i].equals("javascript")) {
               
               continue;
  
            }else
                
               //Adds the value of the array if not equal to others
                new_msg += msg[i] + " ";

            }

        //Displays output
        System.out.println(new_msg);
        
            
        }
        
   
   
    public static void main(String[] args) {
        
        //Declares variable
        String message = "Yash is a javascript ninja";
        
        //Calls Method
        Remove(message);
        
    }
    
}

 
