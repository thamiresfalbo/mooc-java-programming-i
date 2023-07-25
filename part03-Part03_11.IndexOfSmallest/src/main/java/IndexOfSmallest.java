
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int temp = Integer.valueOf(scanner.nextLine());
            if (temp != 9999) {
                list.add(temp);
                continue;
            } else {
                break;
            }
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallNumber) {
                smallNumber = list.get(i);
            }
        }

        System.out.println("Smallest number: " + smallNumber);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallNumber) {
                System.out.println(String.format("Found at index %s", i));
            }

        }
    }
}
