import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainNumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Введите пять чисел :");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }
        if (numbers.size() > 1) {
            System.out.println("Yes");
        }
    }
}
