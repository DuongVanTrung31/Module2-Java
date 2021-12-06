package BaiTap;

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong nguyen to can in: ");
        int count = 0;
        int numbers = input.nextInt();
        int n = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                count++;
                System.out.printf("-%d",n);
            }
            n++;
        }
    }
}
