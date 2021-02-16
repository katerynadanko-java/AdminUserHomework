package utils;

public class StringHelper {
    public static String centralElementDefinition(String firstString, char[] characters) {
        if (characters == null || characters.length == 0) {
            throw new NullPointerException("Array of characters should not be null!");
        }
        String secondString = String.valueOf(characters);
        if (firstString == null || firstString.trim().isEmpty()
                || secondString == null || secondString.trim().isEmpty()) {
            throw new SecurityException("None of strings should not be empty!");
        }
        String firstUpper = firstString.trim().toUpperCase();
        String secondLower = secondString.trim().toLowerCase();
        String result = String.format(firstUpper + "%s" + secondLower, " ");
        String center;
        if (result.length() % 2 == 0) {
            center = result.substring((result.length() / 2) - 1, (result.length() / 2) + 1);
        } else {
            center = result.substring(result.length() / 2, result.length() / 2 + 1);
        }
        return center;
    }
}
