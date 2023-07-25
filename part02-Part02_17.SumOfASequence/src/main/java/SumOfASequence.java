
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int myNumber = Integer.valueOf(scanner.nextLine());
        int mySum = 0;
        for (int i = 0; i <= myNumber; i++) {
            mySum += i;
        }
        System.out.println("The sum is " + mySum);
    }
}
