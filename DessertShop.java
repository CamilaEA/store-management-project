/*
 * Superclass named DessertShop
 */
public class DessertShop {

  //Declares instance variables
  private String name;
  private String type;
  private double price;

  //No-Argument Constructor
  public DessertShop() {
    this.name = "Y/N";
    this.type = "Insert Type";
    this.price = 10.00;
  }
  
  //Parameterized Constructor
  public DessertShop(String name, String type, double price) {
    this.name = name;
    this.type = type;
    this.price = price;
  }

  //Accessor Methods to get name, type, and price
  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public double getPrice() {
    return price;
  }
  
// Mutator Methods to set new name, type, and price
  public void setName(String newName) {
    this.name = newName; 
  }

  public void setType(String newType) {
    this.type = newType;
  
  }

  public void setPrice(double newPrice) {
    if (newPrice < 0) {
      price = 0;
    }
    else {
      price = newPrice;
    }
  }

  //toString() method
  public String toString() {
  String text = "";
  if (price >= 10.00){
    text += "You can get a cake or a cookie";
  } else{
    text += "You can only get a cookie";
  }
  return "Type: " + type + " [" + text + "]" + "\nPrice: "+ price;
}
}