
package VarArg;
public class AddDemo {
    
    void add(int ... num){
        
        int sum =0;
        
        for (int x : num) {
            sum=sum + x;
            
        }
        System.out.println("Sum is "+sum);
        
        
    
    
    }
    void add(double ... num1){
        
        double sum =0;
        
        for (double y : num1) {
            sum=sum + y;
            
        }
        System.out.println("Sum is "+sum);
        
        
    
    
    }
    
    
}
