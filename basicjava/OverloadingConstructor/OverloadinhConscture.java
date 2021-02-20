
package OverloadingConstructor;
public class OverloadinhConscture {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
         Teacher teacher2 = new Teacher("Seaim","Male");
         teacher2.displayInformation();
          Teacher teacher3 = new Teacher("Karim","Male",1628790526);
          teacher3.displayInformation();
    }
    
}
