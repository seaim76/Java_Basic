


import java.util.ArrayList;
import java.util.Scanner;

public class CarSales {
  
public static void main(String[] args)
{
ArrayList<Car> cars = new ArrayList<>();
Scanner sc = new Scanner(System.in);
System.out.println("+**************************************+");
System.out.println("| Welcome to the Car Sales Program |");
System.out.println("+**************************************+");
  
int choice;
do
{
displayMenu();
choice = Integer.parseInt(sc.nextLine().trim());
switch(choice)
{
case 1:
{
try
{
System.out.println("\nADD A CAR:\n----------");
    System.out.println("Enter Your Car ID");
System.out.print("Enter car ID: ");
int id = Integer.parseInt(sc.nextLine().trim());
System.out.print("Enter car model: ");
String model = sc.nextLine().trim();
System.out.print("Enter car vendor: ");
String vendor = sc.nextLine().trim();
System.out.print("Enter car manufacturing year (1900 - 2020): ");
int manufacturingYear = Integer.parseInt(sc.nextLine().trim());
System.out.print("Enter car price: $");
float price = Float.parseFloat(sc.nextLine().trim());
System.out.print("Is it used? [T/F]: ");
char used = Character.toUpperCase(sc.nextLine().trim().charAt(0));
boolean usedStatus;
if(used == 'T')
usedStatus = true;
else
usedStatus = false;
  
Car car = new Car(id, model, vendor, manufacturingYear, price, usedStatus);
  
System.out.print("How many car parts? ");
int n = Integer.parseInt(sc.nextLine().trim());
for(int i = 0; i < n; i++)
{
System.out.print("Enter part ID: ");
int pId = Integer.parseInt(sc.nextLine().trim());
System.out.print("Enter part model: ");
String pModel = sc.nextLine().trim();
System.out.print("Enter part vendor: ");
String pVendor = sc.nextLine().trim();
car.addPart(new CarPart(pId, pModel, pVendor));
}
  
cars.add(car);
System.out.println("Car added successfully.");
  
}catch(InvalidManufacturingYearException imye){
System.out.println(imye.getMessage());
}
System.out.println();
break;
}
  
case 2:
{
System.out.println("\nDISPLAY ALL CARS:\n-----------------");
if(cars.isEmpty())
System.out.println("Sorry, no cars added!\n");
else
{
for(Car c : cars)
System.out.println(c.toString());
System.out.println();
}
break;
}
  
case 3:
{
System.out.println("\nThanks for visiting us . See You Soon !\n");
System.exit(0);
}
default:
System.out.println("\nInvalid selection!\n");
}
}while(choice != 3);
}
  
private static void displayMenu()
{
System.out.print("Choose from the below options:\n"
+ "1. Add a Car\n"
+ "2. Print all cars\n"
+ "3. Exit the program\n"
+ "Your selection >> ");
}
}