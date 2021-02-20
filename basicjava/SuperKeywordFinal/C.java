
package SuperKeywordFinal;
public class C extends Vehicle {
    int gear;
    
    
    C (String c, double w,int g){
        super(c,w);//calling super class constructor
        gear = g;
    }
   void attribute(){
   super.attribute();
       System.out.println("Gear :"+gear);
   
   } 
    
}
