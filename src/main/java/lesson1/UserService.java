package lesson1;

public class UserService implements Service {

    public UserService() {
    }

    @Override
    public void writeData(Person person) {

        System.out.println("Method writeData is not available in the UserService");
    }
}