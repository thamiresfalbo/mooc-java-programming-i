
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myPositiveNumbers = 0;
        int mySum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number > 0) {
                myPositiveNumbers = myPositiveNumbers + 1;
                mySum = mySum + number;
                continue;
            } else if (number < 0) {
                continue;
            } else {
                if (myPositiveNumbers == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    double myAverage = (double) mySum / myPositiveNumbers;
                    System.out.println("Average of the numbers: " + myAverage);
                }
                break;
            }
        }

    }
}
