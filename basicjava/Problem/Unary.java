public class Unary {
  public static void main (String[] args){
      
    /* Unary (+,-)
    
    int x=10;
      int result;

      result=+x;
      System.out.println(+result);

      result=-x;
      System.out.print(+result);

*/

//post-increment 
int x = 25;
int y;
/*
    y=x++;
    System.out.println("First y "+y);
    y=x;
    System.out.println("2nd y "+y);


*/ //pre-increment
        y=++x;
           System.out.println("First y "+y);
        y=x;
            System.out.println("2nd y "+y);

//pre-decrment

         y=--x;
           System.out.println("First y "+y);
        y=x;
            System.out.println("2nd y "+y);

////////// post-decrement

                y=x--;
                System.out.println("First y "+y);
                 y =x;
                System.out.println("2nd y "+y);








  }  
}
