public class StarsInRightTriangle {
  public static void main(String[] args) throws Exception {

    printStarsInRightTriangle(5);
  }

  public static void printStarsInRightTriangle(int num) {
    String result = "";
    for (int i = num; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
        result += "*  ";
      }
      result += "\n";
    }

    // Also works:
    // for (int i = 1; i <= num; i++) {
    // for (int j = i; j <= num; j++) { to change it: (j = 1; j <= i)
    // result += "*  ";
    // }
    // result += "\n";
    // }
    System.out.println(result);
  }
}
