
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myAges = new int[10];
        int count = 0;
        while (true) {
            String text = scanner.nextLine();
            if (text.length() == 0) {
                break;
            }
            String[] pieces = text.split(",");
            myAges[count] = Integer.valueOf(pieces[1]);
            count += 1;
        }
        int bigNumber = myAges[0];

        for (int i = 0; i < myAges.length; i++) {
            if (myAges[i] > bigNumber) {
                bigNumber = myAges[i];
            }
        }
        System.out.println("Age of the oldest:" + bigNumber);

    }
}
