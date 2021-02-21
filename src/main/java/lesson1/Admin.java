package lesson1;

public class Admin extends Person {

    public Admin() {
    }

    public Admin(String firstName, String lastName, int age, String mail, String password) {
        super(firstName, lastName, age, mail, password);
        setRole(Role.ADMIN);
    }
}