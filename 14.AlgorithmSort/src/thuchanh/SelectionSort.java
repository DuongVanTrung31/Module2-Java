package thuchanh;

public class SelectionSort {
    static int[] list = {1, 9, 4, 6, 5, -4};

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            BubbleSort.printArray(i+1, list);
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
    }
}
