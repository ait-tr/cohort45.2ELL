import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        Calculator calculator = new Calculator();
        printer.printIput();

        while (true) {
            int value = scanner.nextInt();
            Result result = calculator.addNumber(value);
            if (value == 0) {
                break;
            }
            System.out.println(result);
            if (result.isAlarm()) {
                printer.printAlarm();
            }
            if (result.isWarning()) {
                printer.printWarning();
            }
        }
    }
}
