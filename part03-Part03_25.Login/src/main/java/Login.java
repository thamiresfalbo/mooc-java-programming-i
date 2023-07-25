
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String myUsername = scanner.nextLine();
        System.out.println("Enter password:");
        String myPassword = scanner.nextLine();

        if (myUsername.equals("alex") && myPassword.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (myUsername.equals("emma") && myPassword.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
