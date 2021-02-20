
package MethodOverloading;
public class Overloading {
     //Declare parameter
    void add (int a,int b){
        System.out.println(a+b);
     
     
     }
void add (double a,double b){
    System.out.println(a+b);
}    

void add(int a,int b,int c){

    System.out.println(a+b+c);
}

void add(){
    System.out.println("Nothing To show");
}
    
}
