package baitap.isPalindrome;


import java.util.*;

public class PalindromeQueue {
    public static void main(String[] args) {
        System.out.println("Enter strings:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase().trim();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        boolean check = true;
        while (!stack.isEmpty()) {
            if(!stack.pop().equals(queue.remove())) {
                check = false;
                break;
            }
        }
        if(check) {
            System.out.println("Is a Palindrome");
        } else {
            System.out.println("Not is Palindrome");
        }
    }
}
