
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int myNumber = Integer.valueOf(scanner.nextLine());
            if (myNumber != -1) {
                list.add(myNumber);
                continue;
            } else {
                break;
            }
        }

        // Then it computes the average of the numbers on the list
        // and prints it.
        int mySum = 0;
        for (int i = 0; i < list.size(); i++) {
            mySum += list.get(i);
        }
        double myAverage = (double) mySum / list.size();
        System.out.println("Average: " + myAverage);

    }
}
