public class Start {
   public static void main(String[] args) {
           
           Burger b = new Burger();
           b.setName("Veg Chilli");
           b.setNumberOfPatties(3);
           b.setPrice(50);
           b.showDetails();
           System.out.println("Number of patties are "+b.getNumberOfPatties()+"\n");
           
           Burger b1 = new Burger(2, 40, "Spicy wrap");
           b1.showDetails();
           System.out.println("Number of patties are "+b1.getNumberOfPatties()+"\n");
           
           
           Pizza p = new Pizza();
           p.setName("Margeritta non veg");
           p.setSize("Medium");
           p.setPrice(60);
           p.showDetails();
           System.out.println("Size is "+p.getSize()+"\n");
           
           Pizza p1 = new Pizza("Large", 85, "Cheesy corn");
           p1.showDetails();
           System.out.println("Size is "+p1.getSize());
}
   
}
class FoodItem{
        double price;
        String name;
        public double getPrice() {
                return price;
        }
        public void setPrice(double price) {
                this.price = price;
        }
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        
        FoodItem(){
                price = 0.00;
                name = "";
        }
        
        FoodItem(double price , String name){
                this.price = price;
                this.name = name;
        }
        
        public void showDetails() {
                System.out.println("Name is "+this.getName());
                System.out.println("Price is "+this.getPrice());
        }
}
class Pizza extends FoodItem{
        String size;
        public String getSize() {
                return size;
        }
        public void setSize(String size) {
                this.size = size;
        }
        
        Pizza(){
                super();
                this.size = "";
        }
        
        Pizza(String size , double price , String name){ 
                super(price , name); 
                this.size = size;
        }
}
class Burger extends FoodItem{
        int numberOfPatties;
        Burger(){
                super();
                this.numberOfPatties = 0;
        }
        
        Burger(int numberOfPatties , double price , String name){
                super(price , name); 
                this.numberOfPatties = numberOfPatties;
        }
        
        public int getNumberOfPatties() {
                return numberOfPatties;
        }
        public void setNumberOfPatties(int numberOfPatties) {
                this.numberOfPatties = numberOfPatties;
        }
        
        
}

