package question4;

/**
 *
 * @author Anrich
 */
public class Question4 {

    static void FindMissing(int[] MissingNumberList){
        
        int missingnum = 0;
        
        for (int i = 0; i < MissingNumberList.length - 1; i++) {
            
            int nextnum = MissingNumberList[i] + 1;

            if (MissingNumberList[i+1] == nextnum ) {
                
                continue;
            }
            else
                missingnum = nextnum;
            
        }
        
        System.out.println(missingnum + " is the missing number" ); 
        
    }
    
    public static void main(String[] args) {
        
      final int[] MissingNumberList = {1,2,3,4,5,6,7,9,10} ;
      
      FindMissing(MissingNumberList);
        
    }
    
}
