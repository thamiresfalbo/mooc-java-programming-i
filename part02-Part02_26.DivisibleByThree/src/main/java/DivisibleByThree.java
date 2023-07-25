
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static void divisibleByThreeInRange(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
