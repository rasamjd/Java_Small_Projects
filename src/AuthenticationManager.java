import java.util.Scanner;

public class AuthenticationManager {
  static Scanner inputReader = new Scanner(System.in);
  public static void main(String[] args) {
    String username = "John";
    String password = "doe123secret"; 
    authenticate(username, password);

    inputReader.close();
  }

  public static void authenticate(String username, String password) {
    String usernameInput = "";
    String passwordInput = "";
    do {
        System.out.println("Enter your username: ");
        usernameInput = inputReader.nextLine();
        System.out.println("Enter your password: ");
        passwordInput = inputReader.nextLine();
        if (!usernameInput.equals(username) || !passwordInput.equals(password)) {
          System.out.println(">>> Incorrect username or password! try again...");
        }
    } while (!usernameInput.equals(username) || !passwordInput.equals(password));
    System.out.println(">>> Logged in successfully!");
}

}
