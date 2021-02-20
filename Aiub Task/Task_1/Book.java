class Bookm
{
private String bookName;
private String bookAuthor;
private String bookId;
private String bookType;
private int bookCopy; 
static int bookCounter=0;
  public Bookm()
  {
	  System.out.println(); 
	  System.out.println("          Book Details");
	  System.out.println("         ==============");
	  System.out.println();
  }

  public Bookm(String n,String a,String i,String t,int c)
      {
         bookName=n;
		 bookAuthor=a;
		 bookId=i;
		 bookType=t;
		 bookCopy=c;
	
      }
	  public void setName(String N)
	  {
		  bookName=N;
		 
	  }
	  public void setAuthor(String A)
	  {
		  bookAuthor=A;
		
	  }
	  public void setId(String I)
	  {
		   bookId=I;
		 
	  }
	  public void setType(String T)
	  {
		  bookType=T;
	  }
	  public void setCopy(int C)
	  {
		  bookCopy=C;
	  }
	  public String getName()
	  {
		 return  bookName;
		 
	  }
	  public String getAuthor()
	  {
		  return  bookAuthor;
	  }
	  public String getId()
	  {
		  return  bookId;
	  }
	  public String getType()
	  {
		 return  bookType; 
	  }
	  
	  public int getCopy()
	  {
		 return  bookCopy;
		 
	  }
	  
  public void ShowBookInfo()
  {
	  System.out.println("Name Of The Book   : "+bookName);
	  System.out.println("Author Of The Book : "+bookAuthor);
	  System.out.println("ID Of The Book     : "+bookId);
	  System.out.println("Type Of The Book   : "+bookType);
	  System.out.println("Copy Of Book       : "+bookCopy);
	  bookCounter++;
	  
	  System.out.println();
      System.out.println();

  }	  
 /* public void AddBookCopy()
  {
	  int copy=0;
	  copy=copy+bookCopy;
	  System.out.println("Total Number of Book :"+copy);
	  
  }*/


  static void showTotalBookInfo()
  {
    System.out.println("Total Types Of Book : "+bookCounter); 
  }	  
	
}





public class Book
{
	public static void main(String args[])
	{
		Bookm a= new Bookm();
		Bookm b =new Bookm("Teach YourSelf java","harry","014","Programming",5);
		b.ShowBookInfo();
		a.setName("The Self-Taught Programmer");
		a.setAuthor("Cory Althoff");
		a.setId("056");
		a.setType("Programming");
		a.setCopy(10);
		a.ShowBookInfo();
		b.showTotalBookInfo();
		//a.AddBookCopy();
	}
}
