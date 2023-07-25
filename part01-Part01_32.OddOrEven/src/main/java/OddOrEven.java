
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int myNumber = Integer.valueOf(scan.nextLine());
        if (myNumber % 2 == 0) {
            System.out.println(String.format("Number %s is even.", myNumber));
        } else {
            System.out.println(String.format("Number %s is odd.", myNumber));
        }
    }
}
