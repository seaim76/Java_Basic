package basicjava;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        //Arry declearation
        double[] number = new double[5];
        System.out.println("Enter 5 number");
        //5 ta arrary neyar jonne
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
//5ta array er sum print korar jonne
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }

        System.out.println("The sum is " + sum);

        double avg = sum / number.length;
        System.out.println("The averager is " + avg);

        double max = number[0];//number 0 is initial
//for max value
        for (int i = 1; i < 5; i++) {

            if (max < number[i]) {
                max = number[i];
            }
        }

        System.out.println("max is " + max);

        //for min value
        double min = number[0];

        for (int i = 1; i < 5; i++) {
            if (min > number[i]) {
                min = number[i];

            }

        }
        System.out.println("minimum" + min);

    }
}
