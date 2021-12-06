package ThucHanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien cho vay: ");
        double money = scanner.nextDouble();
        System.out.println("Nhap ti le lai suat hang thang : ");
        double rate= scanner.nextDouble();
        System.out.println("Nhap so thang cho vay: ");
        int month = scanner.nextInt();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (rate/100)/12;
        }
        System.out.println("So tien lai sau " + month + "thang la " + totalInterest);
    }
}
