public class Lecture5_task2 {
    public static void main(String[] args) {
        double[] arr = {7.3, 8.2, 6.4, 3.0, 4.0, 6.0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2.5) {
                System.out.println(i);
                break;
            }
            if (i == arr.length - 1) {
                System.out.println("Not found");
            }
        }
    }
}
