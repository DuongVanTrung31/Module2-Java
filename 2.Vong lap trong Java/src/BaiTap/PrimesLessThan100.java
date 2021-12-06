package BaiTap;

import java.util.Scanner;

public class PrimesLessThan100 {
    public static boolean isPrime(int number){
        if(number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0) {
                   return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            if(isPrime(number)) {
                System.out.printf("-%d",number);
            }
            number ++;
        }
    }
}
