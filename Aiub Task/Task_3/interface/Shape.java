public abstract class Shape //Abstract class
{
	private String TypeofShape ; //Private instance variable
	
	public abstract double area() ; //Abstract public method

	public void setTypeofShape(String TypeofShape) //Setter method for setting type
	{
		this.TypeofShape = TypeofShape ;
	}
	public String getTypeofShape() //Getter method for getting type
	{
		return TypeofShape ;
	}
	public abstract void showdetails() ; // Abstract method for showing
}