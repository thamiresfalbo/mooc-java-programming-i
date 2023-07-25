
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.length() > 0) {
                String[] pieces = text.split(" ");
                System.out.println(pieces[0]);
            } else {
                break;
            }
        }
    }
}
