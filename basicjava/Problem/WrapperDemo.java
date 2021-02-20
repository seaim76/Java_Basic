package basicjava;

public class WrapperDemo {

    public static void main(String[] args) {

        //Premitive --> object wrapper
        int x = 20;
        Integer Y = Integer.valueOf(x);
        System.out.println("y :" + Y);

        Integer z = x;//Integer.valueof(z);  autoboxing
        System.out.println("z is "+x);
        
        
        //obj to prmetive
        
        Double d = new Double (10.25);
        System.out.println("d  "+d);


        double e =d.doubleValue();
        System.out.println("e is "+e);
        

    }
}
