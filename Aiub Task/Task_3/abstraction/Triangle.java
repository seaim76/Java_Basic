public class Triangle extends Shape
{
	private double base ; //Private instance variable
	private double height ; //Private instance variable
	final double a = 0.5 ; //Fixed varibale because we don't have to change it anymore
	public double trianglearea ; //Public instance variable
	
	public Triangle() //Empty constructor
	{
		System.out.println("Empty Triangle") ;
	}
	public Triangle(double base , double height) //Parameterized constructor
	{
		this.base = base ;
		this.height = height ;
	}
	//Getter methods
	public double getbase()
	{
		return this.base ;
	}
	public double getheight()
	{
		return this.height ;
	}
	public double area() //Overridding the method of parent class
	{
		trianglearea = a * base * height ;
		return trianglearea ;
	}
	public void showdetails() //Overridding the method of parent class
	{
		System.out.println("Area of Triangle: " + trianglearea) ;
	}
}