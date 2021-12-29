package baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone number:");
        String input = scanner.nextLine();
        String regex = "^[(][0-9]{2}[)][-][(][0-9]{10,11}[)]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();
        System.out.println(result);
    }
}
