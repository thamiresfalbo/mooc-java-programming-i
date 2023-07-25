
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of gift?");
        int myGift = Integer.valueOf(scan.nextLine());
        double myTax = 0;
        if (myGift < 5000) {
            System.out.println("No tax!");
        } else if (myGift < 25_000) {
            myTax = (100 + (myGift - 5000) * 0.08);
            System.out.println("Tax: " + myTax);
        } else if (myGift < 55_000) {
            myTax = (1700 + (myGift - 25_000) * 0.1);
            System.out.println("Tax: " + myTax);
        } else if (myGift < 200_000) {
            myTax = (4700 + (myGift - 55_000) * 0.12);
            System.out.println("Tax: " + myTax);
        } else if (myGift < 1_000_000) {
            myTax = (22_100 + (myGift - 200_000) * 0.15);
            System.out.println("Tax: " + myTax);
        } else if (myGift >= 1_000_000) {
            myTax = (142_100 + (myGift - 1_000_000) * 0.17);
            System.out.println("Tax: " + myTax);
        }

    }
}
