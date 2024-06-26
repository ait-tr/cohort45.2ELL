import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DataInput {

    private final static int NUMBER_OF_CONDITIONS = 3;

    public Result enterDeposits(Scanner scanner, List<Deposit> list, int amountOfDeposits) {
        for (int i = 0; i < amountOfDeposits; i++) {
            String string = scanner.nextLine();
            String[] strings = string.split(" ");
            String amountOfMoneyString = strings[0];
            int amountOfMoney = Integer.parseInt(amountOfMoneyString);
            String amountOfYearsString = strings[1];
            int amountOfYears = Integer.parseInt(amountOfYearsString);
            String interestRateString = strings[2];
            double interestRate = Double.parseDouble(interestRateString);

            Deposit deposit = new Deposit(amountOfMoney, amountOfYears, interestRate);
            list.add(deposit);
        }
        return new Result();
    }

    public Result readingFromFile(List<Deposit> list, String fileName) throws IOException {

        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String string;
        while ((string = bufferedReader.readLine()) != null) {
            String[] strings = string.split(" ");
            int amountOfDeposits = Integer.parseInt(strings[0]);
            int[] array = new int[strings.length - 1];

            for (int i = 0; i < amountOfDeposits * NUMBER_OF_CONDITIONS; i += NUMBER_OF_CONDITIONS) {
                array[i] = Integer.parseInt(strings[i + 1]);
                int amountOfMoney = array[i];
                array[i + 1] = Integer.parseInt(strings[i + 2]);
                int amountOfYears = array[i + 1];
                array[i + 2] = Integer.parseInt(strings[i + 3]);
                double interestRate = array[i + 2];
                Deposit deposit = new Deposit(amountOfMoney, amountOfYears, interestRate);
                list.add(deposit);
            }
        }
        return new Result();
    }
}
