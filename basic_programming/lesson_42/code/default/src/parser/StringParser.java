package parser;

import calculator.Calculator;
import operator.Operator;

import java.util.Scanner;

public class StringParser implements Parser {

    private final Calculator calculator;
    private final Scanner scanner;

    public StringParser(Calculator calculator, Scanner scanner) {
        this.calculator = calculator;
        this.scanner = scanner;
    }

    public void parse() {
        String stringToCalculate = scanner.nextLine();
        String[] operands = stringToCalculate.split(" ");

        String firstOperand = operands[0]; //первое число
        String secondOperand = operands[2]; //второе число
        String operatorString = operands[1]; //знак

        Operator operator = Operator.findByString(operatorString);
        Double first = Double.parseDouble(firstOperand);
        Double second = Double.parseDouble(secondOperand);

        calculator.calculate(first, second, operator);
    }
}
