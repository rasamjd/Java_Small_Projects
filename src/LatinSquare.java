public class LatinSquare {
  public static void main(String[] args) {
    
    printLatinSquare(7);
  }

  public static void printLatinSquare(int num) {
    String result = "";
    for (int i = 1; i <= num; i++) {
      for (int j = i; j <= num; j++) {
        result += j + "  ";
      }
      for (int j = 1; j < i; j++) {
        result += j + "  ";
      }
      result += "\n";
    }
    System.out.println(result);
  }
}
