class Mob
{
   private String mobileOwnerName;
   private String mobileNumber; // SIM number
   private double mobileBalance;
   private String mobileOSName;
   private boolean lock;
   
   public Mob()
   {
	   System.out.println();
	   System.out.println("        Information");
	   System.out.println("       ==============");
   }
    public Mob(String N, String Nm,double B, String O, boolean L)
   {
	  mobileOwnerName=N;
	  mobileNumber=Nm;
	  mobileBalance=B;
	  mobileOSName=O;
	  lock=L;
   }
   public void setName(String n)
   {
	   mobileOwnerName=n;
	  
   }
   public void setNumber(String nm)
   {
	   mobileNumber=nm;
	  
   }
   public void setBalance(double b)
   {
	   mobileBalance=b;
	  
   }
   public void setOS(String o)
   {
	   mobileOSName=o;
	  
   }
   public void setLock(boolean l)
   {
	   lock=l;
   }
    public String getName()
   {
	  return mobileOwnerName;
	  
   }
    public String getNumber()
   {
	   return mobileNumber;
   }
   public double getBalance()
   {
	   return mobileBalance;
   }
   public String getOS(String o)
   {
	   return mobileOSName;
   }
   public boolean getLock(boolean l)
   {
	   return lock;
   }
  public  void Recharge(int amount)
	{
		if (lock==false)
		{
	 mobileBalance=amount+mobileBalance;
	 System.out.println("Balance After Recharge   : "+mobileBalance);
		}
		else 
		{
			System.out.println("The Device of "+mobileOwnerName+" Is Locked.");
		}
	}
    public void CallSomeone(int timeDuration)
	{
		if (lock==false)
		{
		
		double c=0;
		c=timeDuration*0.5;
		if (c<mobileBalance)
		{
		System.out.println("Call Duration            : "+timeDuration+" Minute");
		System.out.println("Cost For Call            : "+c + " Taka");
		mobileBalance=mobileBalance-c;
		System.out.println("Balance After Call       : "+mobileBalance + " Taka");
		}
		else
		{
			System.out.println("Insufficiant Balance");
		}
		}
		else
		{
			System.out.println(" You Are not able to Recharge or Call Someone");
		}
	}
     public  void ShowInfo()
	 {
		 //if (lock==false)
		 //{
			 System.out.println();
			 System.out.println();
		 System.out.println("Owner's Name             :"+mobileOwnerName);
		 System.out.println("Mobile Number            :"+mobileNumber);
		 System.out.println("Balance Before Recharge  :"+mobileBalance);
		 System.out.println("Mobile OS                :"+mobileOSName);
		 /*}
		 else 
		 {
			 System.out.println("The Phone of "+mobileOwnerName+" Is Locked");
		 }*/
		
	 }
   
   
	
}

public class Mobile
{
	public static void main(String args[])
	{
		Mob a= new Mob();
		Mob b= new Mob("seaim","01628790526",50.00,"Android", false);
		
		b.ShowInfo();
		b.Recharge(50);
		b.CallSomeone(5);
		
		a.setName("rahim");
		a.setNumber("013415224");
		a.setBalance(20);
		a.setOS("iOS");
		a.setLock(true);
		a.ShowInfo();
		a.Recharge(30);
		a.CallSomeone(8);
		
	}
}