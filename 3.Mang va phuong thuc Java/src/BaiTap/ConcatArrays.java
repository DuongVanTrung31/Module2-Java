package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArrays {
    public static void createArray(int[]array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(array));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng 1 : ");
        int lenArray1 = scanner.nextInt();
        int []array1 = new int[lenArray1];
        createArray(array1);
        System.out.print("Nhập độ dài của mảng 2 : ");
        int lenArray2 =scanner.nextInt();
        int []array2 = new int[lenArray2];
        createArray(array2);
        int []array3 = new int[lenArray1 + lenArray2];
        for (int i = 0; i < array3.length; i++) {
            if (i < lenArray1) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - lenArray1];
            }
        }
        System.out.print("Array 3 : " + Arrays.toString(array3));
    }
}
