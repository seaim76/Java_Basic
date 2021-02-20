public class Customer {
   private int customerId;
   private String firstName;
   private String adress;
   private int age;
   private String gender;
   public Customer(int customerId,String firstName,String adress,int age,String gender) {
       this.setCustomerId(customerId);
       this.setFirstName(firstName);
       this.setLastName(adress);
       this.setAge(age);
       this.setGender(gender);
   }
   public int getCustomerId() {
       return customerId;
   }
   public void setCustomerId(int customerId) {
       this.customerId = customerId;
   }
   public String getFirstName() {
       return firstName;
   }
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   public String getadress() {
       return adress;
   }
   public void setLastName(String lastName) {
       //this.adress = adress;
   }
   public int getAge() {
       return age;
   }
   public void setAge(int age) {
       this.age = age;
   }
   public String getGender() {
       return gender;
   }
   public void setGender(String gender) {
       this.gender = gender;
   }
   public String toString() {
       String str="";
       str+=customerId+"\t"+firstName+" "+adress;  
       return str;
   }

}