package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationHelper {
    private static final String WRIGHT = "It is wright %s%s%n";
    private static final String WRONG = "It is wrong %s%s%n";

    public static void phoneValidation(String phoneNumber) {
        Pattern pattern = Pattern.compile("^\\+[3][8]\\(?[0]\\d{2}\\)?\\-?\\s?\\d{3}\\-?\\s?\\d{2}\\-?\\s?\\d{2}");
        Matcher input = pattern.matcher(phoneNumber);
        boolean matches = input.matches();
        if (matches)
            System.out.printf(WRIGHT, " ukrainian phone number: ", phoneNumber);
        else
            System.out.printf(WRONG, " ukrainian phone number: ", phoneNumber);
    }

    public static void emailValidation(String email) {
        Pattern pattern = Pattern.compile("^\\w+\\@\\D+\\.([c][o][m]|[u][a])$");
        Matcher input = pattern.matcher(email);
        boolean matches = input.matches();
        if (matches)
            System.out.printf(WRIGHT, " email: ", email);
        else
            System.out.printf(WRONG, " email: ", email);
    }

    public static void dateOfBirthValidation(String dateOfBirth) {
        Pattern pattern = Pattern.compile("^((([0][1-9])|([1|2][0-9])|([3][0-1]))(\\.|\\-)(([0][1-9])|" +
                "([1][1-2]))(\\.|\\-)(([1][9][3-9][0-9])|([2][0][0|1][0-9]|([2][0][2][0]))))$|(" +
                "((([0][1-9])|([1|2][0-9])|([3][0-1]))(\\.|\\-)([0][1]))|" +
                "((([0][1-9])|([1][0-6])(\\.|\\-)([0][2]))" +
                "(\\.|\\-)([2][0][2][1])))$");
        Matcher input = pattern.matcher(dateOfBirth);
        boolean matches = input.matches();
        if (matches)
            System.out.printf(WRIGHT, " format for date of birth: ", dateOfBirth);
        else
            System.out.printf(WRONG, " format for date of birth: ", dateOfBirth);
    }
}
