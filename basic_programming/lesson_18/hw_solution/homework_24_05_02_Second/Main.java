package homework_24_05_02_Second;


import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("Text.txt");

        ResultPrinter textPrinter = new ResultPrinter();
        textPrinter.printEvenTxt();

        int sum = 0;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int evenNumbers;
        int i = 0;

        int[] returnedArr = new int[100];
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
                ResultPrinter evenPrinter = new ResultPrinter();
                evenPrinter.printEvenNumber(evenNumbers);

            }

            returnedArr[i] = numbers;
            i++;
        }

        for (int j = 1; j < returnedArr.length - 1; j++) {
            if (returnedArr[j - 1] < returnedArr[j] && returnedArr[j] < returnedArr[j + 1]) {
                count++;
            }
        }
        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.printResult(sum, minNumber, maxNumber, count, returnedArr);

        bufferedReader.close();
    }
}
