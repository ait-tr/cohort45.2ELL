import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  //O(1)

        while (number > 0) { //O(n)
            System.out.println(number);
            number--;
            for (int i = 0; i < number; i++) { //O(1)
                System.out.println("Ура-ура-ура");
            }
        }

        //O(n)

        //O(1) - константная
        //O(n) - линейная
        //O(n^2) - квадратичная
    }
}
