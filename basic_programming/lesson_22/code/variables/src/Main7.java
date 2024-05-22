import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  //O(1)

        int c = 100;
        for (int i = 0; i < c; i++) { //O(1)
            System.out.println(number);
        }

        for (int i = 0; i < 1000; i++) {//O(1)
            System.out.println(number);
        }

        //O(1)
    }
}
