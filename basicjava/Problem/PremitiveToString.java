
package basicjava;
public class PremitiveToString {
    public static void main(String[] args) {
         int i =10;
        double d =10.205;
        float f=30 ;
        boolean w =true;
        
        String z =Integer.toString(i);
        System.out.println("z "+z);
        String b=Double.toString(d);
        System.out.println("b is "+b);
        String e =Float.toString(f);
        System.out.println("E :"+e);
        String r =Boolean.toString(w);
        System.out.println("R "+r);
    }
    
}
