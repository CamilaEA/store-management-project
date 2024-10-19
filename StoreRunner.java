import java.util.Scanner;
//Tester class
public class StoreRunner {
  public static void main(String[] args) {

    // extracredit
    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

  DessertShop nearest  = new DessertShop();
  DessertShop farthest = new DessertShop("Cami", "Chatsworth", 12.00);
  
   System.out.println(nearest);
   System.out.println(farthest);

  Cakes tresLeches = new Cakes ("Cami", "Chatsworth", 9.00, "Sponge Cake", 3 , 2);
  System.out.println(tresLeches);

  Cookies pbj = new Cookies("Cami", "Chatsworth", 5.00, 1, "Peanut Butter & Jelly");
  System.out.println(pbj);
    
    //Welcome Message
    
      DessertShop cake = new DessertShop();
      System.out.println("Welcome to Camila's Desserts! Which dessert would you like to buy today?");
    System.out.println("1. Cakes");
    System.out.println("2. Cookies");
    
      String userType = input.nextLine();
      cake.setType(userType);

     
      System.out.println("What is the Price?");
      double userPrice = input.nextDouble();
      cake.setPrice(userPrice);
    
      System.out.println("Type: " + cake.getType());
      System.out.println("Price: " + cake.getPrice());




    // Closes the Scanner object
    input.close();
    
  }
}