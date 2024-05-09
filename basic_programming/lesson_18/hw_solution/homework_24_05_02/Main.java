package homework_24_05_02;

import java.io.*;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        String[] array = new String[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(random.nextInt(100));
        }
        System.out.print("    Исходный массив:   ");
        System.out.println(Arrays.toString(array));
        System.out.print("       Чётные числа:   ");

        File file = new File("Text.txt");

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
        int i = 0;

        int[] returnedArr = new int[array.length];
        int count = 0;

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }

            int numbers = Integer.parseInt(line);

            sum = sum + numbers;

            if (numbers < minNumber) {
                minNumber = numbers;
            }

            if (numbers > maxNumber) {
                maxNumber = numbers;
            }

            if (numbers % 2 == 0) {
                evenNumbers = numbers;
                System.out.print(evenNumbers + "  ");
            }

            returnedArr[i] = numbers;
            i++;
        }

        for (int j = 1; j < returnedArr.length - 1; j++) {
            if (returnedArr[j - 1] < returnedArr[j] && returnedArr[j] < returnedArr[j + 1]) {
                count++;
            }
        }

        System.out.print("\n              Сумма:   " + sum);
        System.out.print("\n  Минимальное число:   " + minNumber);
        System.out.print("\n Максимальное число:   " + maxNumber);
        System.out.println();
        System.out.println("Возвращённый массив:   " + Arrays.toString(returnedArr));
        System.out.println("Количество чисел больше соседа слева и меньше соседа справа:  " + count);

        bufferedWriter.close();
        bufferedReader.close();
    }
}
