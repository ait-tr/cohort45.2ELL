package printer;

public class ConsolePrinter implements Printer {

    public void print(double result) {
        System.out.printf("Ваш результат равен: %.2f", result);
    }
}
