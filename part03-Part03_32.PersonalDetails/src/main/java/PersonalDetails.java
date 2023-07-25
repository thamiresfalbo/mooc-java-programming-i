
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int mySum = 0;
        int[] myYears = new int[10];
        String[] myPeople = new String[10];

        while (true) {
            String text = scanner.nextLine();
            if (text.length() == 0) {
                break;
            }

            String[] pieces = text.split(",");
            myPeople[count] = pieces[0];
            myYears[count] = Integer.valueOf(pieces[1]);
            mySum += myYears[count];
            count += 1;
        }

        String longestName = "";
        for (int i = 0; i < count; i++) {
            if (myPeople[i].length() > longestName.length()) {
                longestName = myPeople[i];
            }
        }

        double averageYears = (double) mySum / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageYears);
    }
}
