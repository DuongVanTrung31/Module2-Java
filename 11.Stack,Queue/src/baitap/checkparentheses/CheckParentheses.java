package baitap.checkparentheses;

import java.util.Scanner;
import java.util.Stack;

public class CheckParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập code:");
        String string = scanner.nextLine().trim();
        checkParenthese(string);
    }

    private static void checkParenthese(String str) {
        String[] strings = str.split("");
        Stack<String> stack = new Stack<>();
        for (String c : strings) {
            boolean isParentheses = c.equals("(") || c.equals("{") || c.equals("[");
            if (isParentheses) {
                stack.push(c);
            }
            if(!stack.isEmpty()) {
                String peek = stack.peek();
                boolean checkParentheses =
                        c.equals(")") && peek.equals("(") ||
                        c.equals("}") && peek.equals("{") ||
                        c.equals("]") && peek.equals("[");
                if (checkParentheses) {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Well");
        } else {
            System.out.println("????");
        }
    }
}
