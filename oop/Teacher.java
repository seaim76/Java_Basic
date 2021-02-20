package oop;

public class Teacher {
    
        String name,gender;
        int phone;
        
        //deafult constroctor
        Teacher(){
            System.out.println("Deafult");
        }
       ///parameter constroctor
        Teacher(String n,String m,int p){
            name =n;
            gender=m;
            phone=p;
        }
        
        
        void displayInformation()
        {
        System.out.println("Name is "+name);
        System.out.println("Gender is "+gender);
        System.out.println("phone is "+phone); 
        System.out.println("\n");
            
        }
        }
        
        
     
