package BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int numberAdd;
        int index;
        Scanner scan = new Scanner(System.in);
        int[] array = {1, 2, 3, 5, 77, 4, 6, 9};
        System.out.println("Mảng ban đầu :\n" + Arrays.toString(array));
        System.out.println("Nhập số muốn chèn :");
        numberAdd = scan.nextInt();
        System.out.println("Nhập vị trí (index) muốn chèn :");
        index = scan.nextInt();
        int[] newArray = new int[array.length + 1];
        if(index < 0 || index > array.length) {
            System.out.println("Không chèn được vào vị trí đó !!!");
        } else {
            for (int i = 0, j = 0; i < newArray.length; i++) {
                if(i != index) {
                    newArray[i] = array[j];
                    j++;
                }
                else {
                    newArray[i] = numberAdd;
                }
            }
            System.out.print("Mảng mới sau khi chèn phần tử " + numberAdd +" vào vị trí (index) " + index + " :\n" + Arrays.toString(newArray));
        }
    }
}
