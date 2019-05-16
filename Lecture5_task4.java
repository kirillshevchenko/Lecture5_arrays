public class Lecture5_task4 {
    public static void main(String[] args) {
        int[] arr1 = {-80, -2, -99, 5, 5, 17, 7, 12, -56, 1};
        int sum = 0;
        int elementCounter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                sum += arr1[i];
                elementCounter++;
            }
            if (i == arr1.length - 1) {
                System.out.println("Not found");
            }
        }
        double arthmean1 = ((double)sum) / elementCounter;
        System.out.printf("%.2f", arthmean1);
    }
}
