import java.util.Arrays;

public class Lecture5_task5 {
    public static void main(String[] args) {
        int[] arr1 = {-80, -2, -7, 5, 5, 17, 7, 12, -56, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0)
            {
                arr1[i] *= -1;
            }
        }
            Arrays.sort(arr1);
            System.out.println("Max value = " + arr1[arr1.length - 1]);
    }
}
