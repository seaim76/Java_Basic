package basicjava;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num;
         
         System.out.println("Enter the number you want to check :");
         num= input.nextInt();
         
         if(num>0){
        System.out.println("Positive");
    }
         else if(num<0){
             System.out.println("Negative");
         }
         else{
             System.out.println("Zero");
         }
       
    }
    
}
