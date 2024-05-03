import java.io.*;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        //http request java


        File file = new File("Text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true) {
            String line = bufferedReader.readLine();

            if (line == null) {
                break;
            }

            System.out.println(line);
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < 100; i++) {
            bufferedWriter.write("111111111");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
        bufferedReader.close();

    }
}
