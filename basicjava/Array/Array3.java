
package basicjava;

public class Array3 {
    public static void main(String[] args) {
        String []names = {"Seaim","Karim","Rahim","Kuddous"};
       /*
        names[0]="Seaim";
        names[1]="Karim";
        names[2]="Rahim";
        names[3]="Kuddous";
*/
        System.out.println(names.length);
       
      /*
        for (int i = 0; i < 4; i++) {
            System.out.println("Name is "+names[i]);
        }
        */
      
      for ( String x : names){
          System.out.println(x);
          
          
      }
        
        
        
        
    }
    
}
