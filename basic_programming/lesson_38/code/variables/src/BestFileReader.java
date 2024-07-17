package hello;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BestFileReader {

    public static void main(String[] args) {
        File file = new File("hello.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            System.out.println(bufferedReader.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
