
package basicjava;

import java.util.Scanner;

public class DecimalToBinaryOctalHex {
    //Decimal to hex,octal,binary
    public static void main(String[] args) {
        
        int decimal; 
        int octal;
        int hex;
        Scanner input =new Scanner(System.in);
        
        System.out.println("Enter Decimal number:");
        decimal =input.nextInt();
        String d=Integer.toBinaryString(decimal);
        System.out.println("decimal: "+d);
        
        System.out.println("Enter  octal:");
        octal =input.nextInt();
        String o =Integer.toOctalString(octal);
        System.out.println("Octal : "+o);
        
        System.out.println("Enter hex :");
        hex = input.nextInt();
        String h =Integer.toHexString(hex);
        System.out.println("Hex  :"+h);
        
        
    }
    
}
