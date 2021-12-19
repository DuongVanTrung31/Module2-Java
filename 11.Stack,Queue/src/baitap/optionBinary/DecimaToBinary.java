package baitap.optionBinary;

import java.util.Scanner;
import java.util.Stack;

public class DecimaToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên cần chuyển sang nhị phân");
        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int soDu;
        while (number > 0) {
            soDu = number % 2;
            stack.push(soDu);
            number /= 2;
        }
        while (stack.size() < 5) {
            stack.push(0);
        }
        System.out.println("Chuyển sang hệ nhị phân là: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
