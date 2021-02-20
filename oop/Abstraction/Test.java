
package Abstraction;
public class Test {
    public static void main(String[] args) {
        MobileUser mu;//ref variable
        mu = new Rahim();
        mu.sendMessage();
        
        mu.call();
        mu = new karim();
        mu.sendMessage();
        
    }
    
}
