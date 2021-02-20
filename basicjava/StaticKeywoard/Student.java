
package StaticKeywoard;

public class Student {
    String name;
    int id;
    static String universityName="Aiub";
    
    
    Student(String n,int i){
    name =n;
    id=i;
    
    }
    void ShowInformation(){
        System.out.println("Name "+name);
        System.out.println("id"+id);
        System.out.println("Univarsiy"+universityName);
    }
    
    
    
    }
    
    
    
    

