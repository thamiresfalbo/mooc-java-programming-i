
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mySum = 0;
        System.out.println("First Number?");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last Number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        for (int i = firstNumber; i <= lastNumber; i++) {
            mySum += i;
        }
        System.out.println("The sum is " + mySum);

    }
}
