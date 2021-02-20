import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Positive number: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
    }
    }
}