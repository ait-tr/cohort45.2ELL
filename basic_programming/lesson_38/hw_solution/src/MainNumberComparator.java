import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class MainNumberComparator {

    public static void main(String[] args) {

        File file = new File("Text.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            List<String> list = bufferedReader.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .toList();

            int firstNumber = Integer.parseInt(list.get(0));
            int secondNumber = Integer.parseInt(list.get(1));

            compareNumbers(firstNumber, secondNumber);
        } catch (CheckedException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void compareNumbers(int firstNumber, int secondNumber) throws CheckedException {
        if (firstNumber < secondNumber) {
            throw new CheckedException("Второе число больше первого: " + firstNumber + " < " + secondNumber);
        }
        System.out.println("Первое число больше второго: " + firstNumber + " > " + secondNumber);
    }
}
