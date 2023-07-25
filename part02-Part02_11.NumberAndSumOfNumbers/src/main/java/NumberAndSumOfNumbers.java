
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myOnes = 0;
        int mySum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 0) {
                myOnes = myOnes + 1;
                mySum = mySum + number;
                continue;
            } else {
                System.out.println("Number of numbers: " + myOnes);
                System.out.println("Sum of the numbers: " + mySum);
                break;
            }
        }

    }
}
