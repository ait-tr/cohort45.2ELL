import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы хотите положить в Message ?");
        String answer = scanner.nextLine();

        if (answer.equals("строку")) {
            System.out.println("Введите сообщение:");
            String message = scanner.nextLine();
            Message<String> stringMessage = new Message<>(message);
            System.out.println("Содержимое сообщения :\n" + stringMessage.getContent());
        } else if (answer.equals("число")) {
            System.out.println("Введите число:");
            int number = Integer.parseInt(scanner.nextLine());
            Message<Integer> intMessage = new Message<>(number);
            System.out.println("Содержимое сообщения :\n" + intMessage.getContent());
        } else {
            System.out.println("Повторите попытку !");
        }
    }
}
