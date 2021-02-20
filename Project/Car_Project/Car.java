import java.util.ArrayList;

public class Car {
private int ID;
private String model, vendor;
private int manufacturingYear;
private float price;
private ArrayList<CarPart> parts;
private boolean usedStatus;
  
public Car()
{
this.ID = 0;
this.model = this.vendor = "";
this.manufacturingYear = 1900;
this.price = 0.0F;
this.parts = new ArrayList<>();
this.usedStatus = false;
}

public Car(int ID, String model, String vendor, int manufacturingYear, float price,
boolean usedStatus) throws InvalidManufacturingYearException {
setID(ID);
setModel(model);
setVendor(vendor);
setManufacturingYear(manufacturingYear);
setPrice(price);
setUsedStatus(usedStatus);
this.parts = new ArrayList<>();
}
  
public void addPart(CarPart part)
{
this.parts.add(part);
}

public int getID() {
return ID;
}

public String getModel() {
return model;
}

public String getVendor() {
return vendor;
}

public int getManufacturingYear() {
return manufacturingYear;
}

public float getPrice() {
return price;
}

public ArrayList<CarPart> getParts() {
return parts;
}

public boolean isUsedStatus() {
return usedStatus;
}

public void setID(int ID) {
this.ID = ID;
}

public void setModel(String model) {
this.model = model;
}

public void setVendor(String vendor) {
this.vendor = vendor;
}

public void setManufacturingYear(int manufacturingYear) throws InvalidManufacturingYearException {
if(manufacturingYear < 1900 || manufacturingYear > 2020)
throw new InvalidManufacturingYearException("Invalid manufacturing year.");
this.manufacturingYear = manufacturingYear;
}

public void setPrice(float price) {
this.price = price;
}

public void setUsedStatus(boolean usedStatus) {
this.usedStatus = usedStatus;
}
  
@Override
public String toString()
{
String status;
if(isUsedStatus())
status = "Used";
else
status = "Not used";
String out = "ID: " + getID() + ", Model: " + getModel() + ", Vendor: " + getVendor()
+ ", Manufacturing year: " + getManufacturingYear()
+ ", Price: $" + String.format("%,.2f", getPrice()) + ", Status: " + status + "\n"
+ "Parts:\n";
for(CarPart part : parts)
out += "\t" + part.toString() + "\n";
  
return out;
}
}
