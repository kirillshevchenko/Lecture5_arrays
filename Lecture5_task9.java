import java.util.Arrays;

public class Lecture5_task9 {
    public static void main(String[] args) {
        int[] arr1 = {-80, 0, -7, 5, 5, 17, 7, 12, -56, 81};
        int i, temp;
        int n = arr1.length;
        temp = arr1[n - 1];
        for (i = n - 1; i > 0; i--) {
            arr1[i] = arr1[i - 1];
        }
        arr1[0] = temp;
        System.out.println(Arrays.toString(arr1));
    }
}
