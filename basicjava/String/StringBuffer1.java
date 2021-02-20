
package basicjava;
public class StringBuffer1 {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Seaim");
        System.out.println(sb);
        
        
        sb.append("  Tanzimul haque " );
        System.out.println("Append:- "+sb);
        sb.append(25);
     
    //    sb.delete(5,12);
       // System.out.println("Deleted :"+sb);
       
       
       sb.setLength(11);
        System.out.println("length is  "+sb);
        
        
        
        
    }
}
