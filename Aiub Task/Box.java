package Problem1;
public class Box {
    
    double height,width,depth;
    
    //constactor and inisitialiazion
    Box(double h,double w,double d){
        height =h;
        width=w;
        depth=d;
        }
    void displayVol(){
        
      double vol=  height*depth*width;
        System.out.println("Volume is :"+vol);
    
    }
    
}
