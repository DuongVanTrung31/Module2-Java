package baitap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số USD: ");
        usd = scanner.nextDouble();
        double rate = usd * vnd;
        System.out.println("Giá trị VND: " + rate);
    }
}