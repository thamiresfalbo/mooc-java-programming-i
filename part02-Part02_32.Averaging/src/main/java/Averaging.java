
public class Averaging {

    public static int sum(int num1, int num2, int num3, int num4) {
        int totalSum = num1 + num2 + num3 + num4;
        return totalSum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int mySum = sum(number1, number2, number3, number4);
        double myAverage = (double) mySum / 4;
        return myAverage;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
