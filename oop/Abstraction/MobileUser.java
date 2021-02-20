package Abstraction;

public abstract class MobileUser {
    
    void call(){//non Abstract method
        System.out.println("Call method");
    
    }
    
    //Abstract method
    abstract void sendMessage();
    
}
