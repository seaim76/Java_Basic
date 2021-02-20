
package basicjava;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
       int num1,num2, result;
       
       Scanner input =new Scanner(System.in);

       System.out.println("Enter two intger number");

       num1=input.nextInt();
       num2=input.nextInt();
      
      

    result = num1+num2;
    System.out.println("The sum is "+result);   

    result = num1-num2;
    System.out.println("The sub is "+result);   

    result = num1*num2;
    System.out.println("The Multi is "+result);   

    result =num1/num2;
    System.out.println("The div is "+result);  

    result = num1%num2;
    System.out.println("The Reminder is "+result);   
  








    }
    
}
