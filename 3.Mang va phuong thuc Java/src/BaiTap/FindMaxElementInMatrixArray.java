package BaiTap;

import java.util.Arrays;

public class FindMaxElementInMatrixArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {9, 4, 6},
                {8, 99, 0}};
        System.out.println("Mảng matrix cho trước : \n" + Arrays.deepToString(matrix));
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là : " + max);
    }
}
