package basicjava;

import java.util.Scanner;

public class palindromeNumber {
  
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int sum=0,r,temp,num;
        System.out.println("Enter any number :");
        num = input.nextInt();
        
        temp=num;
        
        while(temp!=0){
        //Reminder =r (Vag sesh holo reminder)
            r=temp % 10;
            sum =sum*10+ r;
            temp=temp/10;
        
        }
        System.out.println("Some of degits :"+sum);
        
    if (num==sum) {
        System.out.println("Palindrome");
    }
    
    else{
        System.out.println("Not plaindrome");
    }


        }
}

