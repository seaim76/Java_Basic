
package basicjava;

import java.util.Scanner;


public class VowelConsonent2 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        char ch;
        System.out.println("Enter Any Letter :-");
        ch=input.next().charAt(0);
        System.out.print("The letter you have enter is :"+ch);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.print(" Vowel");
        }
        else{
            System.out.println("Consonant");
    
    }
        
        
    }
    
}
