package baitap.bai1;

import java.util.LinkedList;
import java.util.Scanner;

public class MainFindMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter strings :");
        String str = scan.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> charLists = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            charLists.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(j) >  charLists.getLast()) {
                    charLists.add(str.charAt(j));
                }
            }
            if(charLists.size() > max.size()) {
                max.clear();
                max.addAll(charLists);
            }
            charLists.clear();
        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
    /*********************************************************************************
     * 	Tính toán độ phức tạp của bài toán:                                           *
     * 	1 vòng lặp bên ngoài = n;                                                     *
     * 	1 vòng lặp bên trong = n - 1;                                                 *
     *  1 câu lệnh = 1                                                                *
     * 	1 vòng lặp * 1 câu lệnh = 1;                                                  *
     *  T(n) = (n * (n - 1)) + (1 + 1);                                               *
     *  T(n) = O(n^2) + O(n);                                                         *
     * 	T(n) = O(n^2);                                                                *
     * 	=> Độ phức tạp bài toán này là O(n^2)                                         *
     *********************************************************************************/
}

