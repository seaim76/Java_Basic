package basicjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList1 {
    public static void main(String[] args) {
         
        ArrayList<Integer> number = new ArrayList<Integer> ( );
        System.out.println("initilize Size :"+number.size());
        //Adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
      
        
//for each loop
    for (int x :number){
         System.out.print(" "+x);
     }
        System.out.println("");
//System.out.println(number);
      
//itetator 
/*
Iterator itr = number.iterator();

while(itr.hasNext()){
    System.out.print(" "+itr.next());
}

*/








System.out.println("Now array size is : "+number.size());
        
        
        
      number.remove(1);
        System.out.println("Removing"+number);
      



    }
    
}
