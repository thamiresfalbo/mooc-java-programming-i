
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.valueOf(scanner.nextLine());
        int secondNumber = Integer.valueOf(scanner.nextLine());
        if (firstNumber > secondNumber) {
            System.out.println(String.format("%s is greater than %s", firstNumber, secondNumber));
        } else if (firstNumber < secondNumber) {
            System.out.println(String.format("%s is smaller than %s", firstNumber, secondNumber));
        } else {
            System.out.println(String.format("%s is equal to %s", firstNumber, secondNumber));
        }

    }
}
