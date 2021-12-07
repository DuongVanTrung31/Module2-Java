package BaiTap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumInColumOfMatrixArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo mảng 2 chiều số thực");
        System.out.print("Nhập số lượng của mảng : ");
        int leng = scanner.nextInt();
        System.out.print("Nhập số lượng con của phần tử : ");
        int leng2 = scanner.nextInt();
        double[][] matrix = new double[leng][leng2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Array [" + i +"][" + j +"]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Mảng đã khởi tạo là : \n" + Arrays.deepToString(matrix));
        System.out.println("Chọn cột muốn tính tổng : ");
        int column = scanner.nextInt();
        if (column < leng2){
            double sum = sumOfCol(matrix,column);
            System.out.println("Tổng của cột " + column + " = " + sum);
        } else {
            System.out.println("Nhập sai vị trí cột !!");
        }
    }
    public static double sumOfCol(double[][] array, int column) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == column) {
                    sum += array[i][column];
                }
            }
        }
        return sum;
    }
}
