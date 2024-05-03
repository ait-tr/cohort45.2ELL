import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BanketFileReader extends BanketReader {

    private String fileName;

    private BufferedReader bufferedReader;

    public BanketFileReader(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        FileReader fileReader = new FileReader(fileName);
        this.bufferedReader = new BufferedReader(fileReader);
    }

    @Override
    Person readLine() throws IOException {
        String string = bufferedReader.readLine();
        Person person = new Person(string);
        return person;
    }

}
