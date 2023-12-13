public class StarsInPointedTriangle {
  public static void main(String[] args) {

    printStarsInPointedTriangle(5);
  }

  public static void printStarsInPointedTriangle(int num) {
    String result = "";
    boolean reachedLimit = false;
    for (int i = 0; i <= num; ) {
      if (reachedLimit == false) {                   
        for (int j = 1; j <= i; j++) {
          result += "*  ";
        }          
        i++;
        if (i == num) reachedLimit = true;
      } else {
        for (int j = 1; j <= i; j++) {
          result += "*  ";
        }        
        i--;
        if (i <= 0) break;
      }
      result += "\n";
    }

    // Also works:
    // for (int i = 1; i <= num; i++) {
    //   for (int j = 1; j <= i; j++) {
    //     result += "*  ";
    //   }
    //   result += "\n";
    // }
    // for (int i = 1; i <= (num - 1); i++) {
    //   for (int j = i; j <= (num - 1); j++) {
    //     result += "*  ";
    //   }
    //   result += "\n";
    // }
    System.out.println(result);
  } 
}
