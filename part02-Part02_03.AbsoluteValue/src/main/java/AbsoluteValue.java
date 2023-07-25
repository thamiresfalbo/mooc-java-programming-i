
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = Integer.valueOf(scanner.nextLine());
        if (myNumber < 0) {
            System.out.println(myNumber * -1);
        } else {
            System.out.println(myNumber);
        }
    }
}
