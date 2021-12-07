package BaiTap;

import java.util.Scanner;

public class CountCharInStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi vào : ");
        String str = scanner.nextLine();
        System.out.println("Nhập ký tự vào : ");
        char character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == character){
                count++;
            }
        }
        System.out.println("Chuỗi có " + count + " ký tự " + character);
    }
}


