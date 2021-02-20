package basicjava;

import java.util.Random;

public class RamdomNumberDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int randomNumber =rand.nextInt(91) + 10;
        //if i need 100
        System.out.println("Randomnumber ="+randomNumber);
        
    }
    
}
