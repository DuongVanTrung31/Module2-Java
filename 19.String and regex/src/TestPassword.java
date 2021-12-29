import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwordRegex = "^(?=.*?[A-Z])([a-z]*)(?=.*?[0-9])(?=.*?[^\\w\\s]).{8,}$";
        Pattern pattern;
        Matcher matcher;
        do {
            System.out.println("Enter password: ");
            String input = scanner.nextLine();
             pattern = Pattern.compile(passwordRegex);
             matcher = pattern.matcher(input);
            if(matcher.find()) {
                System.out.println("Success");
            } else {
                System.err.println("Check your password wrong!!!");
            }
        } while (true);
    }
}
