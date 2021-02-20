package basicjava;

import java.util.Arrays;

public class ShortingArray {

    public static void main(String[] args) {
        int[] number = {-5, 10, 20, 80, 100};
        Arrays.sort(number);
        System.out.println("Accending");

        for (int i = 0; i < 5; i++) {
            System.out.print("   " + number[i]);
            System.out.println("");

        }
        System.out.println("");
        
        System.out.println("Decending");
        
        for (int i = 4; i >=0; i--) {
            System.out.println("   "+number[i] );
           
        }
        String[] names = {"eaim","arim","rahim","kabila"};
        Arrays.sort(names);
        System.out.println(" Accending name");
        for (int i = 0; i < 4; i++) {
            System.out.println(" "+names[i]);            
        }
        System.out.println(" Densending names   ");
        for (int i = 3; i>=0; i--) {
            System.out.println("  "+names[i]);
            
            
        }
        
        
        
        

    }

}
