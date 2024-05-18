
//   1) Создайте новый проект и создайте в нем текстовый файл
//
//    2) Придумать алгоритм, который бы записал в файл 100 случайных чисел
//    3) Придумать алгоритм, который бы прочитал весь файл и вычислил бы:
//
//    3.1) Сумму всех чисел
//    3.2) Самое больше и самое маленькое число
//    3.3) Сколько чисел делятся на 2


//FileReader fileReader = new FileReader(file);
//BufferedReader bufferedReader = new BufferedReader(fileReader);

//
//    4*) Сколько чисел больше соседа слева ("до них") и меньше соседа справа ("после них")
//    Пример: 5, 8, 9
//
//    5**) попробовать сделать хоть немного в стиле ООП

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(0, 100);
            String string = String.valueOf(randomNumber);

            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int[] array = new int[100];
        //for (int i = 0; i < 100; i++) {
        //    String string = bufferedReader.readLine();
        //    int number = Integer.parseInt(string);
        //    array[i] = number;
        //}

        int i = 0;
        while (true) {
            String string = bufferedReader.readLine();
            if (string == null) {
                break;
            }
            int number = Integer.parseInt(string);
            array[i] = number;
            i++;
        }

        //    3.1) Сумму всех чисел
        //    3.2) Самое больше и самое маленькое число
        //    3.3) Сколько чисел делятся на 2

        int sum = 0;
        int min = array[0];
        int max = array[0];
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];

            if (array[j] < min) {
                min = array[j];
            }

            if (array[j] > max) {
                max = array[j];
            }

            if (array[j] % 2 == 0) {
                count = count + 1; //count += 1; count++;
            }
        }

        int result = 0;
        for (int j = 1; j < array.length - 1; j++) {
            if (array[j] > array[j - 1] && array[j] < array[j + 1]) {
                System.out.println("Число " + array[j] + " больше, чем число " + array[j - 1]
                        + " и меньше, чем число " + array[j + 1]);
                result++;
            }
        }


        System.out.println(result);

        Calculator calculator = new Calculator(array);
        int resultSum = calculator.calculateSum();
        System.out.println(resultSum);





    }
}
