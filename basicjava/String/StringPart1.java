package basicjava;


public class StringPart1 {
    public static void main(String[] args) {
        
        String s1="Seaim";
        String s2 = new  String ("Seaim");
        
      
         char [] s3 = {'a','b','c','d'};    
         System.out.println(s3);
         
         
         int len =s1.length();
         System.out.println("Length s1 "+len);
         
         
         
        
         
         
         if (s1.equals(s3)) {
             System.out.println("Equal");
            
        }
         else   {
         System.out.println("not equal");
         
         }
       
        System.out.println("S1 is"+s1);
        System.out.println("S2 is"+s2);
        ///true false
        
        boolean con =s1.contains("aim");
        System.out.println(con);
        ///is empty
        
        boolean b =s1.isEmpty();
        System.out.println("b "+b);
                 
                
                
                
                
        
        
        
        
    }
}

    

