
package basicjava;

import java.util.Scanner;


public class ScannerMtoN {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int sum=0;
       int m , n;
       
        System.out.println("Entger initial number");
        m=input.nextInt();
        
        System.out.println("Entger Final number");
          n=input.nextInt();
        
        
        
        for (int i = m; i <= n; i++) {
           //condition i%2==o for even
            if(i%2!=0){
                
            sum= sum + i;
            System.out.println("  "+i);            
        }
        }
        System.out.println("Sum is  "+sum);
    }
    
}

