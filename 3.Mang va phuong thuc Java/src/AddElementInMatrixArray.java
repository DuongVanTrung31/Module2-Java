import java.util.Arrays;
import java.util.Scanner;

public class AddElementInMatrixArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo mảng 2 chiều số nguyên");
        System.out.print("Nhập số lượng của mảng : ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số lượng mảng của phần tử con: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Array [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng đã khởi tạo là : \n" + Arrays.deepToString(matrix));
        System.out.println("Nhập giá trị phần tử cần thêm : ");
        int numberAdd = scanner.nextInt();
        System.out.println("Nhập vị trí hàng muốn thêm phần tử : ");
        int indexRow = scanner.nextInt();
        System.out.println("Nhập vị trí cột muốn thêm phần tử : ");
        int indexCol = scanner.nextInt();
        if (indexRow < 0 || indexRow > matrix.length || indexCol < 0 || indexCol > matrix[0].length) {
            System.out.println("Không thêm được vào vị trí đó");
        } else {
            int index = 0;
            int[][] newArr = new int[matrix.length][matrix[0].length + 1];
            for (int i = 0; i < newArr.length; i++) {
                for (int j = 0; j < newArr[i].length; j++) {
                    if (!(i == indexRow && j == indexCol)) {
                        newArr[i][j] = matrix[i][index];
                        if (index < matrix.length - 1) {
                            index++;
                        }
                    } else {
                        newArr[indexRow][indexCol] = numberAdd;
                    }
                }
                index = 0;
            }
            for (int i = 0; i < newArr.length; i++) {
                if (indexRow != i) {
                    newArr[i][newArr[i].length - 1] = 0;
                }
            }
            System.out.println("Mảng mới = " + Arrays.deepToString(newArr));
        }
    }
}
