
package basicjava;
public class StringPart2 {
    public static void main(String[] args) {
        
       String firstName = "Tanzimul Haque";
       String lastName ="Seaim";
       
       
    //   String FullName = firstName + lastName;
    
    String fullName =firstName.concat(lastName);
        System.out.println("Full name is :"+fullName);
   
        
        boolean b = firstName.startsWith("t");
        System.out.println("b is "+b);
        
        boolean a = lastName.endsWith("m");
        System.out.println("A is :"+a);
    
        String [] names ={"Seaim","Karim","Rahim"};
        for (String x :names) {
            System.out.print("  "+x);
            
        }
        
    
    }
    
    
}
