import java.util.Arrays;

public class Lecture5_task10 {
    public static void main(String[] args) {
        int[] arr1 = {-80, -2, -7, 5, 5, 17, 7, 12, -56, 81, -4, -3, -78, 95};
        Arrays.sort(arr1);
        int sum = arr1[0] + arr1[arr1.length - 1];
        System.out.println(sum);
    }
}
