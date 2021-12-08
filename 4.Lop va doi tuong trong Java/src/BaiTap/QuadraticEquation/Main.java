package BaiTap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a : ");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị b : ");
        double b = sc.nextDouble();
        System.out.println("Nhâp giá trị c : ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.result();
    }
}
