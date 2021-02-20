import java.util.*;
public class Length {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
String s;
char t;
int n,i=0;	
	System.out.print("Enter Your String : ");
	s = sc.nextLine();
	i=s.length();
	System.out.println("Length of The String : "+i);
	System.out.print("Character Of Even Position : ");
	for (n=0; n<=(s.length()-1);n=n+2)
	{
		//t= 
		System.out.print(" "+s.charAt(n));
	}
	
	}
}