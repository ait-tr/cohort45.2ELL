import java.util.Scanner;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>();
        Double result = calculator.sum(5, 4);
        System.out.println(result);

        Calculator<Double> calculator1 = new Calculator<>();
        Double result1= calculator1.sum(5.4, 4.3);
        System.out.println(result1);

        Printer<Integer> printer = new Printer<>();
        printer.print(5);

        Printer<Double> printer1 = new Printer<>();
        printer1.print(12.3);

        Printer<Long> printer2 = new Printer<>();
        printer2.print(2345678722233L);

        //Printer<String> printer3 = new Printer<>();
        //printer3.print("2345");

    }
}
