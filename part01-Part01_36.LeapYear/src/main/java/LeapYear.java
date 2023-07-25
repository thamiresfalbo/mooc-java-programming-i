
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int myYear = Integer.valueOf(scan.nextLine());
        if (myYear % 4 == 0 && myYear % 100 != 0) {
            System.out.println("The year is a leap year.");
        } else if (myYear % 4 == 0 && myYear % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
