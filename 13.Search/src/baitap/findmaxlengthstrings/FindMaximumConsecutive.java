package baitap.findmaxlengthstrings;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaximumConsecutive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String input = scan.nextLine();
        findMaximumStrings(input);
    }

    private static void findMaximumStrings(String input) {
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                if (!(input.charAt(j) > list.getLast())) {
                    break;
                }
                list.add(input.charAt(j));
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}