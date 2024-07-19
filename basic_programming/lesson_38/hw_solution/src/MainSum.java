import java.io.*;
import java.util.List;
import java.util.stream.Stream;

public class MainSum {
    public static void main(String[] args) {

        File file = new File("Text.txt");
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            List<String> list = bufferedReader.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .toList();

                int number = Integer.parseInt(list.get(0));
                int sum = calculateSum(number);
                System.out.println("Сумма всех чисел от 1 до " + number + " равна " + sum);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        if (sum > 10_000) {
            throw new UncheckedException("Сумма превышает 10_000: " + sum);
        }
        return sum;
    }
}
