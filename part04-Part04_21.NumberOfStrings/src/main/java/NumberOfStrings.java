
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.contains("end")) {
                break;
            } else {
                count += 1;
            }
            System.out.println(count);
        }

    }
}
