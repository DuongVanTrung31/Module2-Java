package BaiTap.StopWatch;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < args.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        selectionSort(array);
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tempt = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempt;
                }
            }
        }
    }
}
