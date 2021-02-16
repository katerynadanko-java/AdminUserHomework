package utils;

public class StringHelper {
    public static String centralElementDefinition(String firstString, char[] characters) {
        if (characters == null || characters.length == 0) {
            throw new NullPointerException("Array of characters should not be null!");
        }
        String secondString = String.valueOf(characters);
        String firstTrim = firstString.trim();
        String secondTrim = secondString.trim();
        if (firstString == null || firstTrim.isEmpty() || secondString == null || secondTrim.isEmpty()) {
            throw new SecurityException("None of strings should not be empty!");
        }
        String result = String.format(firstTrim.toUpperCase() + "%s" + secondTrim.toLowerCase(), " ");
        String center;
        if (result.length() % 2 == 0) {
            center = result.substring((result.length() / 2) - 1, (result.length() / 2) + 1);
        } else {
            center = result.substring(result.length() / 2, result.length() / 2 + 1);
        }
        return center;
    }
}
