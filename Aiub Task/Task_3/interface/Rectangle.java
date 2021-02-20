public class Rectangle extends Shape
{
	private double length ; //Private instance variable
	private double width ; //Private instance variable
	public double rectangearea ; //Public instance variable
	
	public Rectangle() //Empty constructor
	{
		System.out.println("Empty Rectangle") ;
	}
	public Rectangle(double length , double width) //Parameterized constructor
	{
		this.length = length ;
		this.width= width ;
	}
	//Getter methods
	public double getbase()
	{
		return this.length ;
	}
	public double getheight()
	{
		return this.width ;
	}
	public double area() //Overridding the method of parent class
	{
		rectangearea = length * width ;
		return rectangearea ;
	}
	public void showdetails() //Overridding the method of parent class
	{
		System.out.println("Area of Rectangle: " + rectangearea) ;
	}
}