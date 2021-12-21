package thuchanh;

public class BubbleSort {
    public static void bubbleSort(int[] lists) {
        boolean check = true;
        for (int i = 1; i < lists.length && check; i++) {
            check = false;
            for (int j = 0; j < lists.length - i; j++) {
                if (lists[j] > lists[j + 1]) {
                    int temp = lists[j];
                    lists[j] = lists[j + 1];
                    lists[j + 1] = temp;
                    check = true;
                }
            }
            printArray(i, lists);
        }
    }

    public static void printArray(int o, int[] a) {
        System.out.printf("%d: ", o);
        for (int i = 0; i < a.length; i++){
            System.out.printf("%-6d", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
    }
}
