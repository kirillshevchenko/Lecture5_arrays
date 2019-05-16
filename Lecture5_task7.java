

public class Lecture5_task7 {
    public static void main(String[] args) {
        int[] arr1 = {-80, -2, -7, 5, 5, 17, 7, 12, -56, 81, -4, -3, -78};
        double sum = 0;
        int elementCounter = 0;
        for (int i = 2; i < arr1.length; i++) {
            if (i % 3 == 0) {
                elementCounter++;
                sum += arr1[i];
            }
        }
        System.out.println(String.format(elementCounter + " " + "%.2f", + sum));
    }
}
