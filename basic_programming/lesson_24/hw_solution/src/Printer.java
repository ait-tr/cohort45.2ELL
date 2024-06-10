public class Printer {

    public static void printEnter() {
        System.out.println("Введите сюда что-нибудь: ");
    }

    public static void printStrings(String string) {
        System.out.println(string);
        System.out.println();
    }

    public static void printString() {
        System.out.print("Строка из первых букв слов:  ");
    }

    public static void printAnswer(char a) {
        System.out.print(a + "  ");
    }


    public static void printResult(int l, char a, char b) {
        System.out.println("\nРазмер получившейся строки:  " + l + "  символов");
        System.out.println("Первая буква строки:  " + a);
        System.out.println("Последняя буква строки:  " + b);
        System.out.println("________________________________");
        System.out.println();
    }

    public static void printExample() {
        System.out.println("Введите пример в формате: " +
                "\n\"число знак число\". " +
                "\nНапример:  " +
                "\nа) 4 + 4  " +
                "\nб) 23 * 78  " +
                "\nв) 12 / 45  " +
                "\nг) 3 - 7");
    }

    public static void printAnswers(double a) {
        System.out.println(" = " + a);
    }
}
