import java.lang.*;
public class Inventory implements InsertRemove , Show //Implementing interface classess
{
	public Shape shapes[] ; //Array object of Shape class
	public static int numberOfShapes ; //Static variable
	
	static //Static block for initiliazing static variable
	{
		numberOfShapes = 0 ;
	}
	
	public Inventory() //Empty constrcutor
	{
		System.out.println("Empty Inventory") ;
	}
	public Inventory(int sizeOfInventory) //Parameterized constructor
	{
		shapes = new Shape[sizeOfInventory] ; //Declaring array here by new keyword
	}
	
	public void insertShape(Shape s) //Method for inserting shape
	{
		numberOfShapes++ ; //Will increase number of shapes whenever this method is invoked
		int flag = 0 ; //Flag counter to make sure shape got inserted
		for(int i=0 ; i<shapes.length ; i++) //For loop to go through every space
		{
			if(shapes[i] == null) //Finding null to insert shape
			{
				shapes[i] = s ; //Inserted
				flag = 1 ; //Proof of insertion 
				break ; //Break if inserted
			}
		}
		if(flag == 1) //Showing proof of shape insertion
		{
			System.out.println() ;
			System.out.println("Shape inserted") ;
		}
		else
		{
			System.out.println() ;
			System.out.println("Shape not inserted") ;
		}
	}
	
	public void removeShape(Shape s) //Method for deleting shape
	{
		numberOfShapes-- ; //Will decrease number of shapes whenever this method is invoked
		int flag = 0 ; //Flag counter to make sure shape got removed
		for(int i=0 ; i<shapes.length ; i++) //For loop to go through every space
		{
			if(shapes[i] == s) //Finding shape to remove
			{
				shapes[i] = null ; //Removed
				flag = 1 ; //Proof of removal
				break ; //Break if removed
			}
		}
		if(flag == 1) //Showing proof of shape removal
		{
			System.out.println() ;
			System.out.println("Shape removed") ;
		}
		else 
		{
			System.out.println() ;
			System.out.println("Shape not removed") ;
		}
		System.out.println() ;
	}
	
	public void showAllShapes() //Public method for showing all informations 
	{	
		for(int i=0 ; i<shapes.length ; i++) //For loop to go through every space
		{
			if(shapes[i] != null) //Checking if there is any empty space. If not, show informations
			{
				System.out.println("---------- " + i + " ----------") ; //Printing the shape number
				shapes[i].showdetails() ; //Printing area of shape
				System.out.println() ;
			}
		}
	}
	
	public void showShapesByType(String type) //Method for priting shapes by specific type
	{
		for(int i=0 ; i<shapes.length ; i++) //For loop to go through every space
		{
			//Checking if the number given in main method matches the stored string
			//Also checking if there is any null or not. Because if there is null, we will have null pointer exception error
			//So we will ignore null here
			if(shapes[i] != null && shapes[i].getTypeofShape() == type)
			{
				System.out.println() ;
				System.out.println("Shapes by type,") ;
				shapes[i].showdetails() ; //If matches, show area of that specific shape
			}
		}
	}
}