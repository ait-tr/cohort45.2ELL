package homework_24_05_02_Second;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class FileWriter {
    public static void main(String[] args) throws IOException {
         Random random = new Random();

        String[] array = new String[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(random.nextInt(100));
        }

        File file = new File("Text.txt");

        java.io.FileWriter fileWriter = new java.io.FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < array.length; i++) {
            bufferedWriter.write(array[i]);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
    }
}
