package baitap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClazz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name:");
        String input = scanner.nextLine();
        String regex = "(^[CAP])([0-9]{4})([GHIKLM]$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();
        System.out.println(result);
    }
}
