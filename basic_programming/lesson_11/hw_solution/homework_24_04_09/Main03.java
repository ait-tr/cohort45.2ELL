package homework_24_04_09;

/*
Сделать метод, который принимает строку.
Этот метод возвращает целое число - длину введеной строки.
Как это сделать - найдите самостоятельно
 */
public class Main03 {
    public static int countLengthString(String clause) {
        return clause.length();
    }

    public static void main(String[] args) {
        String clause = "I love Java!";
        System.out.println("Длина строки равна :  " + clause.length());

    }
}
