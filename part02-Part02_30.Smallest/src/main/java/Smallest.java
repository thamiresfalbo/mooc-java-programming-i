
public class Smallest {

    public static int smallest(int number1, int number2) {
        int smallNumber = 0;
        if (number1 <= number2) {
            smallNumber += number1;
        } else {
            smallNumber += number2;
        }
        return smallNumber;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
