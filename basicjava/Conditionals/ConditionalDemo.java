
package basicjava;


import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int num1,num2;
        System.out.println("Enter Two number");
        num1=input.nextInt();
        num2=input.nextInt();
        
        int large=(num1>num2)? num1 : num2 ;
        System.out.println("Large number "+large);
    }
    
}
