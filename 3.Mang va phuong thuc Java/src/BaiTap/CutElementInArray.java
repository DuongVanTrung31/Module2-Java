package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class CutElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7, 6, 7, 1, 2, 4, 1};
        System.out.println("Mảng cho trước :");
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa khỏi mảng :");
        int soXoa = scanner.nextInt();
        int count = 0;
        for (int i = 0, j = i ; i < array.length; i++) {
            if(array[i] != soXoa) {
                array[j] = array[i];
                j++;
            } else {
                count++;
            }
        }
        while (count > 0){
            array[array.length - count] = 0;
            count--;
        }
        System.out.print("Mảng sau khi xóa phần tử "+ soXoa + " là :\n" + Arrays.toString(array));
    }
}
