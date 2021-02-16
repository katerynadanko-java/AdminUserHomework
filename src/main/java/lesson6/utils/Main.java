package utils;

public class Main {

    public static void main(String[] args) {
        String firstString = "Kateryna";
        char[] characters = {'D', 'a', 'n', 'k', 'o'};
        System.out.println(StringHelper.centralElementDefinition(firstString, characters));

        ValidationHelper.phoneValidation("+38(067) 788 62 56");
        ValidationHelper.emailValidation("katerynadanko@gmail.com");
        ValidationHelper.dateOfBirthValidation("10.11.2000");
    }
}
