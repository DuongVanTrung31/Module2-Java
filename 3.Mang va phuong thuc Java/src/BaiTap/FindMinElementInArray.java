package BaiTap;

import java.util.Scanner;

public class FindMinElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng muốn tạo : ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        ConcatArrays.createArray(array1);
        int minElement = array1[0];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] < minElement) {
                minElement = array1[i];
                index = i;
            }
        }
        System.out.print("Vị trí nhỏ nhất trong mảng là : " + minElement + " nằm ở vị trí(index) " + index);
    }
}
