public class Printer {

    public static void EnterPrint() {
        System.out.println("Введите сюда что-нибудь: ");
    }

    public static void StringsPrint(String string) {
        System.out.println(string);
        System.out.println();
    }

    public static void StringPrint() {
        System.out.print("Строка из первых букв слов:  ");
    }

    public static void AnswerPrint(char a) {
        System.out.print(a + "  ");
    }


    public static void ResultPrint(int l, char a, char b) {
        System.out.println("\nРазмер получившейся строки:  " + l + "  символов");
        System.out.println("Первая буква строки:  " + a);
        System.out.println("Последняя буква строки:  " + b);
        System.out.println("________________________________");
        System.out.println();
    }
    public static void ExamplePrint(){
        System.out.println("Введите пример в формате: " +
                "\n\"число знак число\". " +
                "\nНапример:  " +
                "\nа) 4 + 4  " +
                "\nб) 23 * 78  " +
                "\nв) 12 / 45  " +
                "\nг) 3 - 7");
    }
}
