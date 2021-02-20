import java.util.Scanner;
public class Main {
   public static void menu() {
       System.out.println("********* Car to Choose**********");
       System.out.print(" Froad ID_(1)");
       System.out.print("Corola ID_(2)");
       System.out.print("Bmw ID_(3 )");
       System.out.print("Tesla ID_(4)");
       System.out.print("Suzuki ID_(5)");
       System.out.println("Toyota ID_(6)");
       
       System.out.println(" ");
       System.out.println("1. Buy car");
       System.out.println("2. Display current Order");
       System.out.println("3. Cancel car");
       System.out.println("4. Quit");
   }

   public static int input() {
       Scanner in=new Scanner(System.in);
       int choice;
       do {
           System.out.print("Enter option: ");
           choice=in.nextInt();
       }while(choice<1 && choice>4);
      
       return choice;
   }
  
   public static void main(String[] args) {
       BookCar bookcar=new BookCar();
       Car c1=new Car(1,"Froad","Black","Petrol",30000,"2020");
       Car c2=new Car(2,"Corola","White","Petrol  ",50000,"2010");
       Car c3=new Car(3,"Bmw","Silver","Diesel",30000,"2012");
       Car c4=new Car(4,"Tesla","Red","Petrol",40000,"2013");
       Car c5=new Car(5,"Suzuki","Black","Petrol",30000,"2014");
       Car c6=new Car(6,"Toyota","Black","Diesel",60000,"2015");
      
       bookcar.addCar(c1);
       bookcar.addCar(c2);
       bookcar.addCar(c3);
       bookcar.addCar(c4);
       bookcar.addCar(c5);
       bookcar.addCar(c6);
      
       int choice;
       do {
           menu();
           choice=input();
           switch(choice) {
               case 1:
                   bookcar.book();
                   break;
               case 2:
                   bookcar.currentOrder();
                   break;
               case 3:
                   bookcar.cancelBooking();
                   break;
               case 4:
                   break;
           }
       }while(choice!=4);

   }

}