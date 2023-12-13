import java.util.Scanner;

public class PasswordGenerator {
  static Scanner inputReader = new Scanner(System.in);

  static char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
  static char[] symbols = {'!', '@', '#', '$', '%', '&'};
  static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
                            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
  static char[] bigAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
                              'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
  public static void main(String[] args) {

    int numberOfChars = 0;
    
    do {
      System.out.println("Enter number of characters you want your password to have: \n(at least 5 and no more than 20)");
      numberOfChars = inputReader.nextInt();;
      inputReader.nextLine();
    } while (!(numberOfChars >= 5) || !(numberOfChars <= 20));   

    System.out.println("Your password: " + generatePassword(numberOfChars));

    inputReader.close();
}

  public static int generateRandomNumber(int min, int max) {
    double random = Math.random();
    int randomNumber = (int) Math.floor(random * (max - min + 1) + min);
    return randomNumber;
  }

  public static char generateChar() {
    char character = '0';
    int randomChar = generateRandomNumber(1, 8);
    if (randomChar == 1) {
        return symbols[generateRandomNumber(0, 5)];
    } else if (randomChar == 2 || randomChar == 3 || randomChar == 4) {
        return numbers[generateRandomNumber(0, 9)];      
    } else if (randomChar == 5 || randomChar == 6) {
        return alphabet[generateRandomNumber(0, 25)];
    } else if (randomChar == 7 || randomChar == 8) {
        return bigAlphabet[generateRandomNumber(0, 25)];
    }
    return character;
  }

  public static String generatePassword(int numberOfChars) {
    String password = "";
    int index = 0;
    while (index < numberOfChars) {
      password = password + generateChar();
      index++;
    }

    return password;
  }
}
