import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking{
   private int bookingId;
   private Car car;
   private Customer customer;
   private boolean isCancel;
   private double bookingPrice;
   private String dateOfBooking;
  
   public Booking(){
       setCancel(false);
       Format f = new SimpleDateFormat("MM/dd/yy");
       setDateOfBooking(f.format(new Date()));
   }
   
   public Booking(int bookingId,Car car,Customer customer,double bookingPrice){
       this.setBookingId(bookingId);
       this.setCar(car);
       this.setCustomer(customer);
       this.setBookingPrice(bookingPrice);
       this.setCancel(false);
       Format f = new SimpleDateFormat("MM/dd/yy");
       this.setDateOfBooking(f.format(new Date()));
   }
 
   public String toString() {
       String str="";
       str+=bookingId+"\t"+car.toString()+"\t"+customer.toString()+"\t"+dateOfBooking+"\t"+bookingPrice+"\n";
       return str;
   }
   public int getBookingId() {
       return bookingId;
   }
   public void setBookingId(int bookingId) {
       this.bookingId = bookingId;
   }
   public Car getCar() {
       return car;
   }
   public void setCar(Car car) {
       this.car = car;
   }
   public Customer getCustomer() {
       return customer;
   }
   public void setCustomer(Customer customer) {
       this.customer = customer;
   }
   public boolean isCancel() {
       return isCancel;
   }
   public void setCancel(boolean isCancel) {
       this.isCancel = isCancel;
   }
   public double getBookingPrice() {
       return bookingPrice;
   }
   public void setBookingPrice(double bookingPrice) {
       this.bookingPrice = bookingPrice;
   }
   public String getDateOfBooking() {
       return dateOfBooking;
   }
   public void setDateOfBooking(String dateOfBooking) {
       this.dateOfBooking = dateOfBooking;
   }

}
