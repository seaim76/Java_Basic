

public class CarPart {
private int id;
private String model, vendor;
  
public CarPart()
{
this.id = 0;
this.model = this.vendor = "";
}

public CarPart(int id, String model, String vendor) {
this.id = id;
this.model = model;
this.vendor = vendor;
}

public int getId() {
return id;
}

public String getModel() {
return model;
}

public String getVendor() {
return vendor;
}
  
@Override
public String toString()
{
return(getId() + ", " + getModel() + ", " + getVendor());
}
}
