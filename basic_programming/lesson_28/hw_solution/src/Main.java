import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();

        List<Deposit> list = new ArrayList<>();
        Calculator calculator = new Calculator();
        DataInput dataInput = new DataInput();

        printer.printStart();

        String numbersString = scanner.nextLine();
        int amountOfDeposits = Integer.parseInt(numbersString);

        printer.printConditions();

        Result enter = dataInput.enterDeposits(scanner, list, amountOfDeposits);
        System.out.println(list);

        long nanoTime = System.nanoTime();

        Result result = calculator.calculateProfits(list);

        nanoTime = System.nanoTime() - nanoTime;

        System.out.println(result);
        printer.printTime(nanoTime);

        List<Deposit> linkedList = new LinkedList<>();
        Calculator calculatorForLinkedList = new Calculator();
        DataInput dataInputForLinkedList = new DataInput();

        printer.printLine();
        printer.printStart();

        String numbersStringLinkedList = scanner.nextLine();
        int amountOfDepositsLinkedList = Integer.parseInt(numbersStringLinkedList);

        printer.printConditions();

        Result enterForLinkedList = dataInputForLinkedList.enterDeposits
                (scanner, linkedList, amountOfDepositsLinkedList);

        System.out.println(linkedList);

        long nanoTimeLinkedList = System.nanoTime();

        Result resultForLinkedList = calculatorForLinkedList.calculateProfits(linkedList);

        nanoTimeLinkedList = System.nanoTime() - nanoTimeLinkedList;

        System.out.println(resultForLinkedList);
        printer.printTime(nanoTimeLinkedList);

        List<Deposit> listFromFile = new ArrayList<>();
        Calculator calculatorForFile = new Calculator();
        DataInput dataInputFromFile = new DataInput();

        printer.printLine();

        long nanoTimeForFile = System.nanoTime();

        Result reading = dataInputFromFile.readingFromFile(listFromFile, "Deposits.txt");

        System.out.println(listFromFile);
        Result resultForFile = calculatorForFile.calculateProfits(listFromFile);

        nanoTimeForFile = System.nanoTime() - nanoTimeForFile;

        System.out.println(resultForFile);
        printer.printTime(nanoTimeForFile);
    }
}