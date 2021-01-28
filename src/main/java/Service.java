import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public interface Service {

    default boolean checkUser(Person person) throws FileNotFoundException {

        File file = new File("info");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            if (person.getMail().equals(scanner.nextLine())) {
                System.out.println("true!");
                return true;
            }
        }
        System.out.println("false");
        scanner.close();
        return false;
    }

    void writeData(Person person) throws IOException;
}
