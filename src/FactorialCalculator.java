import java.util.Scanner;

public class FactorialCalculator {
  static Scanner inputReader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter a number to calulate the factorial of it: ");
    int number = inputReader.nextInt();
    inputReader.nextLine();
    System.out.println(calculateFactorial(number));

    inputReader.close();
  } 
 
  public static long calculateFactorial(int num) {
    int index = 1;
    long result = 1;
    while (index <= num) {
        result = result * index;
        index++;
    }
    return result;
}
}
