import java.lang.reflect.Array;
import java.util.Arrays;

public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        // write some code here
        int myArr[] = new int[] { number1, number2, number3 };
        Arrays.sort(myArr);
        return myArr[myArr.length - 1];
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
