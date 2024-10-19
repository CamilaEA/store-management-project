//subclass Cakes that extends the superclass DessertShop
public class Cakes extends DessertShop {

  //Declares the instance variables
  private String cakeType;
  private int numToppings;
  private int layers;

  //No-Argument constructor with default values
  public Cakes() {
    cakeType = "Bundt Cake";
    numToppings = 1;
    layers = 1;
  }

  //Parameterized constructor
  public Cakes(String name, String type, double price, String cakeType, int numToppings, int layers) {
    super(name, type, price);
    this.cakeType = cakeType;
    this.numToppings = numToppings;
    this.layers = layers;
  }

  //Accessor Methods that get the caka type, number of toppings, and the layers
  public String getCakeType() {
    return cakeType;
  }

  public int getNumToppings() {
    return numToppings;
  }

  public int getLayers() {
    return layers;
  }

  //To String Method
  public String toString() {
    return super.toString() + "\nType: " + cakeType + "\nNumber of Toppings: " + numToppings + "\nLayers: " + layers;
  }
}