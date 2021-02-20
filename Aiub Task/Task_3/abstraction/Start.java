public class Start
{
	public static void main(String[] args)
	{
		Inventory i = new Inventory(3) ; //Object for Inventory and giving the size of array by inventory constructor
		
		//Polymorphic behaviour
		//Storing all objects of child class in parent class's object reference by polymorphism
		//Shape c, Shape t, Shape r... All are object reference which are holding the object of it's childclasses
		Shape c = new Circle(1.5) ; //Object for Circle class and giving radius by Circle constructor
		Shape t = new Triangle(5 , 5) ;//Object for Triangle class and giving base and height by Triangle constructor
		Shape r = new Rectangle(5 , 5) ;//Object for Rectangle class and giving Length and width by Rectangle constructor
		
		//Setting types
		c.setTypeofShape("Circle") ;
		t.setTypeofShape("Triangle") ;
		r.setTypeofShape("Rectangle") ;
		
		//Calculating areas
		c.area() ;
		t.area() ;
		r.area() ;
		
		//Inserting shapes
		i.insertShape(c) ;
		i.insertShape(t) ;
		i.insertShape(r) ;
		
		i.removeShape(t) ; //Deleting shapes
		
		i.showAllShapes() ; //Showing all area of shapes
		
		i.showShapesByType("Circle") ; //Showing area by specific types
		
		System.out.println() ;
		System.out.println("####################") ;
		System.out.println("There are total " + Inventory.numberOfShapes + " shapes") ; //Showing the total number of shape
		System.out.println("####################") ;
	}
}