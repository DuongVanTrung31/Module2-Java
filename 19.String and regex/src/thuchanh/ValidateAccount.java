package thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static ValidateAccount validateAccount;
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public ValidateAccount() {
    }


    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        validateAccount = new ValidateAccount();
        for (String account : validAccount) {
            boolean isvalid = validateAccount.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = validateAccount.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
