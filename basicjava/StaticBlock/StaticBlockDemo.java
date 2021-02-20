package StaticBlock;
public class StaticBlockDemo{
    static int id;
    static String name ;
    //Static Block initilization 
    static {
    id=1255;
    name="Seaim";
    }
    static void Display(){
        System.out.println("Name is "+name);
        System.out.println("Id is "+id);
    
    }
    
    
}

    

