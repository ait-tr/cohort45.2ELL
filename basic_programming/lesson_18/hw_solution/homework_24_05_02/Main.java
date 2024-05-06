package homework_24_05_02;

import java.io.*;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws IOException {
        String[] array = new String[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(random.nextInt(100));
        }
        System.out.print("Source array:   ");
        System.out.println(Arrays.toString(array));
        System.out.print("Even numbers:   ");

        File file = new File("OOP/src/homework_24_05_02/Text.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < array.length; i++) {
            bufferedWriter.write(array[i]);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        int sum = 0;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int evenNumbers;

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }

            int numbers = Integer.parseInt(line);

            if (numbers % 2 == 0) {
                evenNumbers = numbers;
                System.out.print(evenNumbers + ",  ");
            }
            sum = sum + numbers;

            if (numbers < minNumber) {
                minNumber = numbers;
            }
            if (numbers > maxNumber) {
                maxNumber = numbers;
            }
        }
        System.out.print("\n         Sum:   " + sum);
        System.out.print("\n  Min number:   " + minNumber);
        System.out.print("\n  Max number:   " + maxNumber);
    }
}
