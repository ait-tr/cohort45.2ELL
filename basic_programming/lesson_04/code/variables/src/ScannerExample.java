import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        System.out.println("Представьтесь:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String greating = "Привет, ";
        String end = "!";

        System.out.println(greating + str + end);
    }

}
