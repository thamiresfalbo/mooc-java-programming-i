
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics myStat = new Statistics();
        Statistics myEven = new Statistics();
        Statistics myOdd = new Statistics();

        System.out.println("Enter numbers: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } else if (input % 2 == 0) {
                myEven.addNumber(input);
            } else {
                myOdd.addNumber(input);
            }

            myStat.addNumber(input);
        }

        System.out.println("Sum: " + myStat.sum());
        System.out.println("Sum of even numbers: " + myEven.sum());
        System.out.println("Sum of odd numbers: " + myOdd.sum());
    }
}
