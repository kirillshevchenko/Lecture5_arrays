import java.util.Arrays;
import java.text.DecimalFormat;

public class Lecture5_task6 {
    public static void main(String[] args) {
        int[] arr1 = {-1, -2, -7, 5, 5, 17, 7, -2, -56, 0};
        Arrays.sort(arr1);
        double b = 2.0;
        double a = arr1[0] * b;
        System.out.println(String.format("%.2f", a));
    }
}
