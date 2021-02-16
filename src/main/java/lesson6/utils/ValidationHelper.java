package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationHelper {
    private static final String WRIGHT = "It is wright";
    private static final String WRONG = "It is wrong";

    static void phoneValidation(String phoneNumber) {
        Pattern pattern = Pattern.compile("^\\+[3][8]\\(?[0]\\d{2}\\)?\\-?\\s?\\d{3}\\-?\\s?\\d{2}\\-?\\s?\\d{2}");
        Matcher input = pattern.matcher(phoneNumber);
        boolean matches = input.matches();
        if (matches)
            System.out.printf(WRIGHT + "%s%s%n", " ukrainian phone number: ", phoneNumber);
        else
            System.out.printf(WRONG + "%s%s%n", " ukrainian phone number: ", phoneNumber);
    }

    static void emailValidation(String email) {
        Pattern pattern = Pattern.compile("^\\w+\\@\\D+\\.([c][o][m]|[u][a])$");
        Matcher input = pattern.matcher(email);
        boolean matches = input.matches();
        if (matches)
            System.out.printf(WRIGHT + "%s%s%n", " email: ", email);
        else
            System.out.printf(WRONG + "%s%s%n", " email: ", email);
    }

    static void dateOfBirthValidation(String dateOfBirth) {
        Pattern pattern = Pattern.compile("^\\d{2}(\\.|\\-)\\d{2}(\\.|\\-)([1][9]|[2][0])\\d{2}$");
        Matcher input = pattern.matcher(dateOfBirth);
        boolean matches = input.matches();
        if (matches)
            System.out.printf(WRIGHT + "%s%s%n", " format for date of birth: ", dateOfBirth);
        else
            System.out.printf(WRONG + "%s%s%n", " format for date of birth: ", dateOfBirth);
    }
}
