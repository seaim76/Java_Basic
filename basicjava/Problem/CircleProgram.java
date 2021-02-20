import java.util.Scanner;


public class CircleProgram {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        double radious,area;
        System.out.print("Enter radious :");
        radious = input.nextDouble();

        area =3.1416 * radious * radious ;
        System.out.print("Area of circle "+area);

    }


    
}
