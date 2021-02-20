public class Car {
   private int ID;
   private String model;
   private String color;
   private String engineType;
   private double price;
   private boolean booked;
   private String dateOfRelease;
   public Car() {
       setBooked(false);
   }
   public Car(int ID,String model,String color,String engineType,double price,String dateOfRelease) {
       this.ID=ID;
       this.model=model;
       this.color=color;
       this.engineType=engineType;
       this.price=price;
       this.dateOfRelease=dateOfRelease;
       setBooked(false);
   }
   public int getID() {
       return ID;
   }
   public void setID(int iD) {
       ID = iD;
   }
   public String getModel() {
       return model;
   }
   public void setModel(String model) {
       this.model = model;
   }
   public String getColor() {
       return color;
   }
   public void setColor(String color) {
       this.color = color;
   }
   public String getEngineType() {
       return engineType;
   }
   public void setEngineType(String engineType) {
       this.engineType = engineType;
   }
   public double getPrice() {
       return price;
   }
   public void setPrice(double price) {
       this.price = price;
   }
   public String toString() {
       String str="";
       str+=ID+"\t"+model+"\t"+color+"\t"+engineType+"\t"+price;
       return str;
   }
   public boolean isBooked() {
       return booked;
   }
   public void setBooked(boolean booked) {
       this.booked = booked;
   }
   public String getDateOfRelease() {
       return dateOfRelease;
   }
   public void setDateOfRelease(String dateOfRelease) {
       this.dateOfRelease = dateOfRelease;
   }
}

