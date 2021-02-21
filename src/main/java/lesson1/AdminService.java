package lesson1;

import java.io.FileWriter;
import java.io.IOException;

public class AdminService implements Service {

    public AdminService() {
    }

    public void writeData(Person person) throws IOException {
        FileWriter writtenDataFile = new FileWriter("dataFile_" + person.getRole() + "_" +
                person.getFirstName() + person.getLastName());

        writtenDataFile.write("Person: " + person);

        writtenDataFile.close();
    }
}
