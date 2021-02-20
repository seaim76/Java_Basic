
package basicjava;

public class String3 {
    public static void main(String[] args) {
        
        String country ="         Bangladesh is my country           ";
        System.out.println(country);
        
        String trim =country.trim();
                System.out.println("Trimming "+trim);
        
        char ch =country.charAt(1);
        System.out.println("CharAt"+ch);
        
        int value =country.codePointAt(0);
        System.out.println("Code Point :"+value);
        
        int index =country.indexOf('n');
        System.out.println("Index of "+index);
        
        int last =country.lastIndexOf('n');
        System.out.println("LAst "+last);
        
        
        
        
        
        
        
    }
    
}
