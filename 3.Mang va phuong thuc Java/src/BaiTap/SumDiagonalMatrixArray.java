package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalMatrixArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo mảng 2 chiều số nguyên");
        System.out.print("Nhập số lượng của mảng : ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số lượng mảng của phần tử con: ");
        int cols = scanner.nextInt();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Array [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Mảng đã khởi tạo là : \n" + Arrays.deepToString(matrix));
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tổng đường chéo chính = : " + sum);
    }
}
