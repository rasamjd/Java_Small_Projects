import java.util.Scanner;

public class FoodOrderHandler {
  public static Scanner inputReader = new Scanner(System.in); 
  static int koobideh = 0;
  static int fesenjoon = 0;
  static int joojeh = 0;
  static int ghormehSabzi = 0;
  static int koobidehPrice = 210000;
  static int fesenjoonPrice = 165000;
  static int joojehPrice = 170000;
  static int ghormehSabziPrice = 175000;

  public static void main(String[] args) {
    String menu = "\n <===---MENU---===> \n"
    + " -> Koobideh ...... 210,000 T \n -> Fesenjoon ...... 165,000 T \n"
    + " -> Joojeh ...... 170,000 T \n -> Ghormeh Sabzi ...... 175,000 T \n "
    + " <==--==>";
    
    handleOrdering(menu);

    inputReader.close();
  }

  public static String getFoodWithMenu(String menu) {
    String food;
    do {
      System.out.println("Please choose a food from the menu: " + menu);
      food = inputReader.nextLine();
    } while (!food.equals("Koobideh") && !food.equals("Fesenjoon") 
          && !food.equals("Joojeh") && !food.equals("Ghormeh Sabzi"));
    return food;  
  }

  public static int getOrderNumber(String food) {
    int portions = 0;
    do {
      System.out.println("How many portions of " + food + " would you like? ");
      portions = inputReader.nextInt();
      inputReader.nextLine();
      if (portions <= 0) {
        System.out.println("Please enter a valid number of portions.");
      } else if (50 < portions) {
        System.out.println("I'm afraid. we don't accept orders this big!");
      }
    } while (!(0 < portions && portions <= 50));
    return portions;
  }

  public static void handleOrdering(String menu) {
    String doContinue = "";
    do {
      String food = getFoodWithMenu(menu);
      int portions = getOrderNumber(food);
      changePrice(food, portions);
      do {
        System.out.println("Would you like to continue your order? \n('yes' or 'no')");
        doContinue = inputReader.nextLine();
      } while (!doContinue.equals("yes") && !doContinue.equals("no"));
    } while (doContinue.equals("yes")); 
    if (doContinue.equals("no")) {
      int totalPrice = sumTotalPrice();
      int service = (int) (totalPrice / 20);
      int taxes = (int) (totalPrice / 20);
      int discountPercent = getDiscountPercentage(); 
      printFinalReceipt(totalPrice, service, taxes, discountPercent);
    }
  }

  public static void changePrice(String food, int number) {
    switch (food) {
      case "Koobideh":
        koobideh = number; // += number;
        break;
      case "Fesenjoon":
        fesenjoon = number; // += number;
        break;  
      case "Joojeh": 
        joojeh = number; // += number;
        break;
      case "Ghormeh Sabzi":
        ghormehSabzi = number; // += number;
    }
  }

  public static int sumTotalPrice() {
    int total = (koobideh * koobidehPrice)
      + (fesenjoon * fesenjoonPrice)
      + (joojeh * joojehPrice) 
      + (ghormehSabzi * ghormehSabziPrice);
    return total;
  }

  public static int getDiscountPercentage() {
    String answer = "";
    String code = "";
    do {
      System.out.println("Do you have a discount code? ('yes' or 'no')");
      answer = inputReader.nextLine();
    } while (!answer.equals("yes") && !answer.equals("no"));

    if (answer.equals("no")) {
      return 0;
    } else if (answer.equals("yes")) {
      do {
        System.out.println("Please enter a valid Code (or continue by 'exit'):");
        code = inputReader.nextLine();
      } while (!code.equals("exit") && !code.equals("LUCKY23478") && !code.equals("COMMON21391"));
    
      if (code.equals("exit")) {
        return 0;
      } else if (code.equals("LUCKY23478")) {
        return 50;
      } else if (code.equals("COMMON21391")) {
        return 15;
      }
    }
    return 0;
  }

  public static void printFinalReceipt(int total, int service, int taxes, int discount) {
    int discountPrice = (int) ((discount / 100.0) * (total + service + taxes));
    int totalAfterDiscount = total + service + taxes - discountPrice;
    System.out.println(
       "\n"
      + "Thank you for choosing us. \n"
      + "---> Your order: \n"
      + koobideh + " Koobideh: " + (koobideh * koobidehPrice) + " T \n"
      + fesenjoon + " Fesenjoon: " + (fesenjoon * fesenjoonPrice) + " T \n"
      + joojeh + " Joojeh: " + (joojeh * joojehPrice) + " T \n"
      + ghormehSabzi + " Ghormeh Sabzi: " + (ghormehSabzi * ghormehSabziPrice) + " T \n"
      + "---> Receipt: "  + "\n"
      + "Order Price: " + total  + " T \n"
      + "Service(5%): " + service  + " T \n"
      + "Taxes(5%): " + taxes + " T \n"
      + "Discount(" + discount + "%): " + discountPrice + " T \n"
      + "Total: " + totalAfterDiscount + " T \n"
    );
  }
}