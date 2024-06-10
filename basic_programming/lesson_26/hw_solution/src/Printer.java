public class Printer {
    public static void printAnswer() {
        System.out.println("В доступе отказано! ");
    }

    public static void printAnswers() {
        System.out.println("Доступ подтвержден!  ");
    }

    public static void printUnderlining() {
        System.out.println("____________________________");
    }

    public static void printFirstInfo(String a, Role b) {
        System.out.println(a + "Тип пользователя:  " + b.getRussianName());
    }
}
