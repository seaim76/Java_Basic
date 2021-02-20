
package basicjava;

import java.util.Scanner;

public class Array5Matrix {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [][] A =new int [2][3];
        int [][] B =new int [2][3];
        int [][] C =new int [2][3];
        
        System.out.println("Enter Number For A matrix :");
        
        //input for A matrix
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] =",row,col);
                A[row][col] = input.nextInt();
                
                
            }
            
        }
        System.out.println("Enter number for B matrix :");
          //input for B matrix
        for (int row = 0; row < 2; row++) {
           
            
            for (int col = 0; col < 3; col++) {
                 System.out.printf("B[%d][%d] =",row,col);
                B[row][col] = input.nextInt();
                
                
            }
            
        }
            
             //printing A matrix
             System.out.print("A =");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                System.out.print("\t  "+A[row][col]); 
                
            }
            System.out.println("\n\n");
        }
        
        //printing B matrix
             System.out.print("B =");
        for (int row = 0; row < 2; row++) {
            
            for (int col = 0; col < 3; col++) {
                System.out.print(" \t "+B[row][col]); 
                
            }
            System.out.println("\n\n");
        }
    
        
           
    
    
}
}
