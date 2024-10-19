//subclass Cookies that extends the superclass DessertShop
public class Cookies extends DessertShop {

  //Declares instance variables
  private int height;
  private String flavor;

  //No-Argument constructor with default values
  public Cookies() {
    height = 1;
    flavor = "Pink Sugar";
  }

  //Paramterized Constructor
  public Cookies(String name, String type, double price, int height, String flavor) {
    super(name, type, price);
    this.height = height;
    this.flavor = flavor;
  }

    //Accessor Methods to get height and flavor
  public int getHeight() {
    return height;
  }

  public String getflavor() {
    return flavor;
  }

  //To String Method
  public String toString() {
    return super.toString() + "\nHeight: " + height + "\nFlavor: " + flavor;
  }
  
}