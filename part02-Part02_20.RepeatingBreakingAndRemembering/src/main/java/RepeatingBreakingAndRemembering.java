
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        int mySum = 0;
        int myNumberOfNumbers = 0;
        int myEven = 0;
        int myOdds = 0;

        System.out.println("Give numbers:");

        while (true) {
            int myNumber = Integer.valueOf(scanner.nextLine());
            if (myNumber != -1) {
                if (myNumber % 2 == 0) {
                    myEven += 1;
                } else {
                    myOdds += 1;
                }
                mySum += myNumber;
                myNumberOfNumbers += 1;
                continue;
            } else {
                double myAverage = (double) mySum / myNumberOfNumbers;
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + mySum);
                System.out.println("Numbers: " + myNumberOfNumbers);
                System.out.println("Average: " + myAverage);
                System.out.println("Even : " + myEven);
                System.out.println("Odds: " + myOdds);
                break;
            }
        }
    }
}
