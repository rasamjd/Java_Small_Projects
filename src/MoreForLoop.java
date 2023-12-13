public class MoreForLoop {
  public static void main(String[] args) {

    printPrimeNumbers(-19, 190);

    String text = "M4 is the best and coolest BMW you can ever find. m";
    char character = 'm';
    System.out.println("The character: '" + character + "' is repeated: " +
    findNumberOfRepeatedChar(text, character) + " times \nin the text: \n" + text);
  
    printStringLetterByLetter("Hello world!");
  }

  public static int findSmallerNumber(int num1, int num2) {
    if (num1 <= num2)
      return num1;
    else
      return num2;
  }

  public static void printPrimeNumbers(int num1, int num2) {
    int smallerNumber = findSmallerNumber(num1, num2);
    int biggerNumber;
    if (smallerNumber == num1) {
      biggerNumber = num2;
    } else
      biggerNumber = num1;

    for (int i = smallerNumber; i <= biggerNumber; i++) {
      boolean isPrime = true;
      for (int j = i - 1; j > 1; j--) {
        if ((i % j) == 0) {
          isPrime = false;
        }
      }
      if (isPrime && (i > 1)) {
        System.out.println("> " + i);
      }
    }
  }

  public static int findNumberOfRepeatedChar(String text, char character) {
    int num = 0;
    for (int i = 0; i <= (text.length() - 1); i++) {
      if (String.valueOf(text.charAt(i)).equalsIgnoreCase(String.valueOf(character))) {
        num++;
      }
    }
    return num;
  }

  public static void printStringLetterByLetter(String text) {
    String alphabet = "!?. abcdefghijklmnopqrstuvwxyz";
    String result = "";
    for (int i = 0; i < text.length(); i++) {
      for (int j = 0; j < alphabet.length(); j++) {
        try {
          Thread.sleep(20);
        } catch (InterruptedException e) {
        }
        System.out.println(result + alphabet.charAt(j));
        if (String.valueOf(alphabet.charAt(j)).equalsIgnoreCase(String.valueOf(text.charAt(i)))) {
          result += alphabet.charAt(j);
          break;
        }
      }
    }
  }
}
