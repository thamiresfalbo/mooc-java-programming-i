
import java.util.Scanner;

public class AverageOfNumbers {

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
                double myAverage = (double) mySum / myOnes;
                System.out.println("Average of the numbers: " + myAverage);
                break;
            }
        }

    }
}
