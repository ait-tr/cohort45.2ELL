import java.util.Scanner;

public class EqualsExample {

    public static void main(String[] args) {
        //"защищенное приложение"
        //спрашивает пароль, и если пароль подойдет, то пишет информацию на экран

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String correctPassword = "qwerty";

        if (password.equals(correctPassword)) {
            System.out.println("Доступ разрешен");
        }
    }
}
