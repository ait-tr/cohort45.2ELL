package calculator;


import operator.Operator;
import printer.Printer;

public class MathCalculator implements Calculator {

    private final Printer printer;

    public MathCalculator(Printer consolePrinter) {
        this.printer = consolePrinter;
    }

    public void calculate(double first, double second, Operator operator) {
        double result = 0.0;

        switch (operator) {
            case Operator.SUM -> result = first + second;
            case Operator.SUBTRACTION -> result = first - second;
            case Operator.DIVIDE -> result = first / second;
            case Operator.MULTIPLY -> result = first * second;
        }

        printer.print(result);

    }
}
