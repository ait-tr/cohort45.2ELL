import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  //O(1)

        for (int i = 0; i < number; i++) {  //O(n) - линейная
            System.out.println(1);
        }

        for (int i = 0; i < number; i++) { //O(n) - линейная
            System.out.println(2);
        }

        //O(n)
        //Линейное
    }
}
