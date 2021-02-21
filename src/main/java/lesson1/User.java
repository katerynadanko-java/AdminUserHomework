package lesson1;

public class User extends Person {

    public User() {
    }

    public User(String firstName, String lastName, int age, String mail, String password) {
        super(firstName, lastName, age, mail, password);
        setRole(Role.USER);
    }
}
