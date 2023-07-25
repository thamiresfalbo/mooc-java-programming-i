
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        // Reads the file
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner scn = new Scanner(Paths.get(file))) {
            while (scn.hasNextLine()) {
                String row = scn.nextLine();
                list.add(Integer.valueOf(row));
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        // Count the numbers
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= upperBound && list.get(i) >= lowerBound) {
                count += 1;
            }
        }

        System.out.println("Numbers: " + count);
    }

}
