import java.util.Scanner;

public class GDCCalculator {
  static Scanner inputReader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter first number: ");
    int firstNum = inputReader.nextInt();
    inputReader.nextLine();
    System.out.println("Enter second number: ");
    int secondNum = inputReader.nextInt();
    inputReader.nextLine();
    calculateGCD(firstNum, secondNum);

    inputReader.close();
  }

  public static int findSmallerNumber(int num1, int num2) {
    if (num1 <= num2) return num1;
    else return num2;
  }

  public static int calculateGCD(int num1, int num2) {  // Greatest Common Devisor
    int smallerNumber = findSmallerNumber(num1, num2);
    int biggerNumber;
    if (smallerNumber == num1) {
        biggerNumber = num2;
    } else biggerNumber = num1;
    int result = smallerNumber;

    float biggerRemainder = 0;
    float smallerRemainder = 0;

    do {
        result--;
        smallerRemainder = smallerNumber % result;
        biggerRemainder = biggerNumber % result;
    } while ((smallerRemainder != 0) || (biggerRemainder != 0));

    System.out.println("Your GCD is: " + result);
    return result;
}
}
