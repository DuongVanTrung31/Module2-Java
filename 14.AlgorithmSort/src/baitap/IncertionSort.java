package baitap;

import thuchanh.BubbleSort;

public class IncertionSort {
    public static void main(String[] args) {
        int[] arrayInts = {2, 5, 6, 323, 66, 81, 23, 56};
        incertionSort(arrayInts);
    }

    public static void incertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            BubbleSort.printArray(i, a);
        }
    }
}
