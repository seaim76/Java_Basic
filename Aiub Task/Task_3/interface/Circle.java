public class Circle extends Shape
{
	private double radius ; //Private instance variable
	final double pi = 3.1416 ; //Fixed varibale because we don't have to change it anymore
	public double circlearea ; //Public instance variable
	
	public Circle() //Empty constructor
	{
		System.out.println("Empty Circle") ;
	}
	public Circle(double radius) //Parameterized constructor
	{
		this.radius = radius ;
	}
	public double getradius() //Getter method
	{
		return this.radius ;
	}
	public double area() //Overridding the method of parent class
	{
		circlearea = pi * radius * radius ;
		return circlearea ;
	}
	public void showdetails() //Overridding the method of parent class
	{
		System.out.println("Area of Circle: " + circlearea) ;
	}
}