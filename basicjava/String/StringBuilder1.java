
package basicjava;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder ("Tanzimul");
        
        System.out.println("Str = "+str);
      
         str.append("  HAQUE");
           str.append( "  "+ 20);
           str.append( "  " +10.25);
           System.out.println(str);
           str.reverse();
           System.out.println("Reverse"+str);
           
           
          
        
        
        
    }
    
}
