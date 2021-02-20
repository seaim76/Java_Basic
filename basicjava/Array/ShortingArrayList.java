
package basicjava;

import java.util.ArrayList;
import java.util.Collections;

public class ShortingArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        
        
        number.add(10);
          number.add(-5);
            number.add(0);
              number.add(100);
                number.add(20);
                
                System.out.println("Before shorting "+number);
                
                Collections.sort(number);
                System.out.println("Accending Order"+number);
                
                
                Collections.sort(number,Collections.reverseOrder());
                System.out.println("Reverse"+number);
                
                
                
                
                
        
    }
    
}
