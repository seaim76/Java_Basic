package basicjava;

import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(30); 
        number.add(40); 
        number.add(60); 
        
        System.out.println("ArrayList contain"+number);
        System.out.println("Size of array"+number.size());
        
        boolean empty =number.isEmpty();
        System.out.println("Array list is Empty :"+empty);
        
        
        
        //contains
        boolean contain =number.contains(40);
        System.out.println("  avaliabe   "+contain);
        
        
        //index printing
        
        int p =number.indexOf(40);
        System.out.println("index is "+p);
        
        
        //set value
        //replacing element
        
        number.set(1,500);
        System.out.println("After setting the vaue  "+number);
        
        
        //get 
       int x = number.get(1);
        System.out.println("Get is"+x);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
