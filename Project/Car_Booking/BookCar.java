import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;


public class BookCar {
   private Car carList[];
   private int totalCar;
   private List<Booking> bookingList;
   private int bookingId;
   private int customerId;
   public BookCar() {
       carList=new Car[10];
       totalCar=0;
       bookingList=new ArrayList<Booking>();
       bookingId=1;
       customerId=1;
   }
  
   public void addCar(Car car) {
       carList[totalCar]=car;
       totalCar++;
   }

   public void book() {
       Scanner in=new Scanner(System.in);
       int carId;
       int custmerId;
       int bookingId;
       String firstName,adress;
       int age;
       String gender;
       double bookingPrice=0;
       String dateOfBooking;
       String homeDelivery;
       int bookingPeriod;

       System.out.print("Enter car Id You Want to Buy: ");
       carId=Integer.parseInt(in.nextLine());
      
       Car car=searchCar(carId);
       if(car==null || car.isBooked()==true) {
           System.out.println("Car id not found or already booked!");
           return;
       }
      
       this.customerId++;
       custmerId=this.customerId;
       this.bookingId++;
       bookingId=this.bookingId;
      
       Format f = new SimpleDateFormat("MM/dd/yy");
       dateOfBooking=f.format(new Date());
       bookingPeriod=car.getDateOfRelease().compareTo(dateOfBooking);
       car.setBooked(true);
      
       System.out.print("Home delivery(y/n): ");
       homeDelivery=in.nextLine();
      
       System.out.print("Enter customer first name: ");
       firstName=in.nextLine();
       System.out.print("Enter customer Adress: ");
       adress=in.nextLine();
       System.out.print("Enter age: ");
       age=Integer.parseInt(in.nextLine());
       System.out.print("Enter gender(m/f): ");
       gender=in.nextLine();
       bookingPrice=car.getPrice();
       if(homeDelivery.equals("y"))
           bookingPrice+=car.getPrice()*0.1;
       if(bookingPeriod>25)
           bookingPrice+=car.getPrice()*0.05;
      
       Customer cust=new Customer(custmerId,firstName,adress,age,gender);
       Booking B=new Booking(bookingId,car,cust,bookingPrice);
       bookingList.add(B);
       System.out.println("Car booking details:");
       System.out.println(B.toString());
      
   }

   public void cancelBooking() {
       Scanner in=new Scanner(System.in);
       int bookingId;
       System.out.print("Enter booking id: ");
       bookingId=Integer.parseInt(in.nextLine());
       Booking B=searchBooking(bookingId);
       if(B==null || B.isCancel()==true) {
           System.out.println("Booking id not found or already cancelled!");
           return;
       }
       System.out.println("Booking details: ");
       System.out.println(B.toString());
      
       System.out.print("Do you want to cancel booking(y/n): ");
       String choice=in.nextLine();
       if(choice.equals("y")) {
           B.setCancel(true);
           System.out.println("Booking cancelled!");
           B.getCar().setBooked(false);
           return;
       }
       System.out.println("Booking not cancelled!");
   }
 
   public Booking searchBooking(int bookingId) {
       Booking B=null;
       for(int i=0;i<bookingList.size();i++) {
           B=bookingList.get(i);
           if(B.getBookingId()==bookingId)
               return B;
       }
       return null;
   }
   
   public Car searchCar(int carId) {
       for(int i=0;i<totalCar;i++) {
           if(carId==carList[i].getID())
               return carList[i];
       }
      
       return null;
   }

   public void currentOrder() {
       Booking B=null;
       System.out.println("Current Order details");
       for(int i=0;i<bookingList.size();i++) {
           B=bookingList.get(i);
           if(B.isCancel()==false)
               System.out.println(B.toString());
       }
   }


}

