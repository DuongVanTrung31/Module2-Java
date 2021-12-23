package baitap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        createTriangle(scan);
    }

    public static void createTriangle(Scanner scanner) {
        System.out.println("Tạo 1 tam giác");
        System.out.println("Nhập vào cạch đầu tiên");
        double canh1 = scanner.nextDouble();
        System.out.println("Nhập vào cạnh thứ 2");
        double canh2 = scanner.nextDouble();
        System.out.println("Nhập vào cạnh thứ 3");
        double canh3 = scanner.nextDouble();
        try {
            checkCondition(canh1,canh2,canh3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkCondition(double a, double b, double c) throws Exception {
        if (a < 0 || b < 0 || c < 0) {
            throw new Exception("Lỗi có cạnh trong tam giác là số âm");
        }
        if(a + b < c || b + c < a || c + a < b) {
            throw new Exception("Tổng 2 cạch 1 tam giác phải lớn hơn cạnh còn lại");
        }
    }
}
