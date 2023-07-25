
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myFact = 1;

        System.out.println("Give a number:");
        int myNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= myNumber; i++) {
            myFact = myFact * i;
        }

        System.out.println("Factorial:" + myFact);

    }
}
