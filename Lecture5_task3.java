public class Lecture5_task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 12};
        int sum = 0;
        int elementCounter = 0;
        for (int i : arr) {
            if (i > 0 && i % 6 == 0) {
                sum += i;
                elementCounter++;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Number of elements = " + elementCounter);
    }
}
