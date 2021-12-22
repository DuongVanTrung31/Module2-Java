package baitap.recursionsearchbinary;


import java.util.Collections;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] ins = {2, 3, 5, 7, 39, 49, 65, 83};
        int first = 0;
        int last = ins.length;
        int num = 3;
        System.out.println("vị trí của num trong mảng là : "+recursive(ins, num, first, last));
    }

    static int recursive(int[] ins, int num, int first, int last) {
        if (last >= first) {
            int mid = (first + last) / 2;
            if (ins[mid] == num) {
                return mid;
            } else if (ins[mid] > num) {
                last = mid - 1;
                return recursive(ins, num, first, last);
            } else {
                first = mid + 1;
                return recursive(ins, num, first, last);
            }
        }
        return -1;
    }
}
