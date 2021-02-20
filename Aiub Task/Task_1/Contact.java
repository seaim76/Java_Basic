class Cont
{
	private String personName;
    private String personId;
    private int age;
    private String mobileNumber;
    private char gender;
	public Cont()
	{
		System.out.println();
		System.out.println("       Contact Details");
		System.out.println("     ===================");
		
	}
	public Cont(String N, String I, int A, String M, char G)
	{
	    personName=N;
        personId=I;
        age=A;
        mobileNumber=M;
        gender=G;
		
	}
	public void setName(String n)
	{
		personName=n;
        
	}
	public void setId(String i)
	{
		personId=i;
        
	}
	public void setAge(int a)
	{
		age=a;
        
	}
	public void setNumber(String m)
	{
		mobileNumber=m;
       
	}
	public void setGender(char g)
	{
		if (g=='m' || g=='f' || g=='M' || g=='F')
		{
			gender=g;
		}
		else {
			System.out.println("Gender Should be M(Male)/F(Female)");
		}
	}
	
	//////////
	
	public String getName()
	{
		return personName;
	}
	public String getID()
	{
		return personId;
	}
	public int getAge()
	{
		return age;
	}
	public String getNumber()
	{
		return mobileNumber;
	}
	public char getGender()
	{
		return gender;
	}
	
	
	public void ShowPersonInfo() 
	{
		System.out.println();
		System.out.println("Person Name   : "+personName);
		System.out.println("Person Id     : "+personId);
		System.out.println("Age           : "+age);
		System.out.println("Mobile Number : "+mobileNumber);
		System.out.println("Gender        : "+gender);
		//System.out.println("Operator      : "+DetectMobileOperator());
		
		//System.out.println();
		
	}
	public void DetectMobileOperator()
	{
		char o=mobileNumber.charAt(2);
		
		if(o=='7' || o== '3')
		{
		System.out.println("Operator      : GRAMEENPHONE"); 
		}
		
		else if(o=='4' || o== '9')
		{
		System.out.println("Operator      : BANGLALINK"); 
		}
		
		else if(o=='8')
		{
		System.out.println("Operator      : ROBI"); 
		}
		
		else if(o=='6')
		{
		System.out.println("Operator      : AIRTEL"); 
		}
		
		else
		{
		System.out.println("No Operator Found");	
		}
		
	}
	
	
}

public class Contact
{
	public static void main(String args[])
	{
		Cont a = new Cont();
		Cont b = new Cont("seaim","002",18,"01628790526",'M');
		b.ShowPersonInfo();
		b.DetectMobileOperator();
		a.setName("rahim");
		a.setId("002");
		a.setAge(180);
        a.setNumber("01946480064");
		a.setGender('M');
		a.ShowPersonInfo();
		a.DetectMobileOperator();
	}
}