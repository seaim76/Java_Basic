package classes;
import java.lang.*;

public class Product extends ProductItem{

  private String category;

  public Product()
  {
  	this("fid" , "name", 0 ,0.0," category");
  }

  public Product(String fid , String name,int availableQuantity, double price , String category ){
  	super(fid, name , availableQuantity, price);
  	this.category = category;
  }

  public void setCategory(String category)
  {this.category = category;}
  public String getCategory()
  {return category;}

  public void showInfo(){
    System.out.println("-------------------------------------------\n\n");
    System.out.println("Product Id          : "+ getFid());
    System.out.println("Product Name        : "+ getName());
    System.out.println("Available Quantity  : "+ getAvailableQuantity());
    System.out.println("Product Price       : "+ getPrice());
  	System.out.println("Product Category    : "+ category);
    System.out.println("-------------------------------------------\n\n");
  }

}