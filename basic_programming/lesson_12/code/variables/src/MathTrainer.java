import java.util.Random;
import java.util.Scanner;

public class MathTrainer {

    //Человек с консоли вводит число - сколько примеров он хочет решить +++++
    //мы по одному примеру генерируем и даем человеку написать ответ
    //потом следующий пример
    //Мы сравниваем наши ответы и ответы компьютера
    //Выводим сообщения (победа или проигрыш)

    public static void main(String[] args) {
        int countOfExamples = readValue(); //создай переменную и возьми у человека с консоли число
        Random random = new Random(); //создай рандомайзер
        for (int i = 0; i < countOfExamples; i++) { //в зависимости от того, какое число ввел человек - столько раз делай действие внутри цикла
            createExampleAndCheckAnswer(random); //создай пример и дай человеку его решить, после этого проверь
        }
    }

    public static void createExampleAndCheckAnswer(Random random) {
        int firstNumber = random.nextInt(0, 100); //сгенерируй число
        int secondNumber = random.nextInt(0, 100); //сгенерируй число

        printExample(firstNumber, secondNumber); //напиши пример на экран

        int answer = sum(firstNumber, secondNumber); //узнай сколько выйдет в результате (по настоящему)
        int answerFromPerson = readValue(); //узнай у пользователя его ответ

        checkAnswer(answer, answerFromPerson); //сравни ответ человека с ответом компьютера
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int readValue() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        return count;
    }

    public static void printExample(int firstNumber, int secondNumber) {
        System.out.print(firstNumber + "+" + secondNumber + "=");
    }

    public static void checkAnswer(int answer, int answerFromPerson) {
        //boolean isEquals = isOneNumberEqualsSecond(answer, answerFromPerson);

        if (answer == answerFromPerson) { //isEquals
            System.out.println("Ты молодец");
        }
        else {
            System.out.println("Попробуй еще раз");
            int newValue = readValue();
            if (newValue == answer) {
                System.out.println("Ну в целом ты молодец");
            }
            else {
                System.out.println("Дурак дураком");
            }
        }
    }

    //public static boolean isOneNumberEqualsSecond(int firstNumber, int secondNumber) {
    //    return firstNumber == secondNumber;
    //}

}
