public class Lecture5_task8 {
    public static void main(String[] args) {
        int[] arr1 = {-80, -2, -7, 5, 5, 17, 7, 12, -56, 81, -4, -3, -78};
        double sum = 0;
        int elementCounter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0) {
                sum += arr1[i];
                elementCounter++;
            }
            if (i == arr1.length - 1) {
                System.out.println("Not found");
            }
        }
        System.out.println(String.format(elementCounter + " " + "%.2f", + sum));
    }
}

