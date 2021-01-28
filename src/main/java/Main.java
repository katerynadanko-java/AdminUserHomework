import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        User userVasiliy = new User("Vasiliy", "Ivanov",
                20, "ivanov18@gmail.com", "vasiv0000");
        Admin adminVladimir = new Admin("Vladimir", "Petrov",
                35, "petrov33@gmail.com", "petrvlad3333");
        Admin adminVlad = new Admin("Vlad", "Nepyjvoda",
                27, "nepyjvoda@gmail.com", "Nepyjvoda222");

        new UserService().writeData(adminVladimir);
        new AdminService().writeData(adminVladimir);
        new AdminService().writeData(userVasiliy);

        new AdminService().checkUser(userVasiliy);
        new UserService().checkUser(adminVladimir);


    }
}
