public class StarsInHourglass {
  public static void main(String[] args) {

    printStarsInHourglass(8);
  }

  public static void printStarsInHourglass(int num) {
    String result = "";
    for (int i = 1; i <= num; i++) {
      for (int k = 2; k <= i; k++) {
        result += "  ";
      }
      for (int j = i; j <= (num); j++) {
        result += "*   ";
      }
      result += "\n";
    }
    for (int i = 2; i <= num; i++) {
      for (int k = (num - 1); k >= i; k--) {
        result += "  ";
      }
      for (int j = 1; j <= i; j++) {
        result += "*   ";
      }
      result += "\n";
    }
    System.out.println(result);
  }
}
