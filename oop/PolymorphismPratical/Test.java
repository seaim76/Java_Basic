
package PolymorphismPratical;
public class Test {
    public static void main(String[] args) {
        
        Shape [] s = new Shape[3];
        
        s[0] = new Shape();
        s[1]=new Rectangle(10,20);
        s[2]=new Triangle(10,20);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());
            
        }
        
    }
    
}
