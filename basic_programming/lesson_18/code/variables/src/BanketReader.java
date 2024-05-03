import java.io.IOException;

public abstract class BanketReader {

    abstract Person readLine() throws IOException;

    public Person[] readAll(int countOfLines) throws IOException {
        Person[] people = new Person[countOfLines];

        for (int i = 0; i < countOfLines; i++) {
            people[i] = readLine();
        }

        return people;
    }

}
