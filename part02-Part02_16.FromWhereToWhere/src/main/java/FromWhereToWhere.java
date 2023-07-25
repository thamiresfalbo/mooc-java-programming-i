
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int myFirstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int mySecondNumber = Integer.valueOf(scanner.nextLine());
        if (myFirstNumber >= mySecondNumber) {
            for (int i = mySecondNumber; i <= myFirstNumber; i++) {
                System.out.println(i);
            }
        }

    }
}
