
import java.util.Arrays;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int[] myAges = new int[10];
        String[] myPeople = new String[10];

        while (true) {
            String text = scanner.nextLine();
            if (text.length() == 0) {
                break;
            }

            String[] pieces = text.split(",");
            myPeople[count] = pieces[0];
            myAges[count] = Integer.valueOf(pieces[1]);
            count += 1;
        }

        int bigNumber = myAges[0];
        String oldestPerson = "";
        for (int i = 0; i < myAges.length; i++) {
            if (myAges[i] >= bigNumber) {
                bigNumber = myAges[i];
                oldestPerson = myPeople[i];

            }
        }

        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
