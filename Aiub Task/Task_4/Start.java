public class Start
{
	public static void main(String args[])
	{
//create array of object 

		Book[] obj = new Book [5];

//create & initialize objects using constructor
        obj [0]=new Book("ISBN-23-453-325","OCA Java SE 8","Peter Norvig",10.00,10);
        obj [1]=new Book("ISBN-24-150-350","Head First Java","Joshua Bloch",25.00,15);
        obj [2]=new Book("ISBN-43-553-145","Effective Java","Nathaniel Borenstein",50.00,20);
        obj [3]=new Book("ISBN-13-853-725","Java: A Beginner’s Guide","Andrei Alexandrescu",65.00,30);
        obj [4]=new Book("ISBN-33-250-825","Java Concurrency in Practice","Bjarne Stroustrup",70.00,12);

 //display the  object data

for (int i= 0;i<obj.length;i++){
    
    obj[i].showDetails();
    System.out.println("---------------------------");
}


		
	}
}