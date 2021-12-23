package thuchanh.arrayindexoutofbound;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArraysExample arraysExample = new ArraysExample();
        Integer[] array = arraysExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của 1 phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
