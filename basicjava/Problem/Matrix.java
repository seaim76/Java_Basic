
package basicjava;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter A number :");
        
        int [][] A=new int[3][3];
        int sumOfDia =0;
        int sumofUpper =0;
         int sumofLower =0;
        //Input Matrix
        
        for (int row = 0; row < 3; row++) {
            
            for (int col = 0; col < 3; col++) {
                A[row][col] =input.nextInt();
            }
            
        }
        
        //Diagonal,upper,lower
        for (int row = 0; row < 3; row++) {
            
            for (int col = 0; col < 3; col++) {
               
                if(row==col){
                     sumOfDia= sumOfDia+A[row][col];
                }
                if(row<col){
                    sumofUpper =sumofUpper+A[row][col];
                }
                if(row>col){
                    sumofLower =sumofLower+A[row][col];
                }
          
            
            }
         }
        System.out.println("Sum of Diagonal :"+sumOfDia);
         System.out.println("Sum of upper :"+sumofUpper);
         System.out.println("Sum of lower :"+sumofLower);
        
        
        
        
    }
    
}
