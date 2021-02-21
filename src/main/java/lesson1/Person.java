package lesson1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String mail;
    private String password;
    private Role role;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String mail, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" +
                "firstName: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "age: " + age + "\n" +
                "mail: " + mail + "\n" +
                "password: " + password + "\n" +
                "role: " + role;
    }
}