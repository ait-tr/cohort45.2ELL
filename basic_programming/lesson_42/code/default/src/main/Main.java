package main;

import calculator.MathCalculator;
import parser.StringParser;
import printer.ConsolePrinter;
import printer.FilePrinter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter();
        MathCalculator mathCalculator = new MathCalculator(filePrinter);
        Scanner scanner = new Scanner(System.in);
        StringParser stringParser = new StringParser(mathCalculator, scanner);

        stringParser.parse();

        scanner.close();
    }
}
