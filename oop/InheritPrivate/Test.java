package InheritPrivate;
public class Test {
    public static void main(String[] args) {
        Teacher t1 =new Teacher();
        t1.setName("Seaim");
        t1.setAge(20);
        t1.setQulification("Bsc");
        
        System.out.println("Name is "+t1.getName());
        System.out.println("Age is  "+t1.getAge());
        System.out.println("Qulification is  "+t1.getQulification());
    }
    
}
