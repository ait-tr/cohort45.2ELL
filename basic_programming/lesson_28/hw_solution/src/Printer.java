public class Printer {
    protected void printStart() {
        System.out.println("Введите количество вкладов :  ");
    }

    protected void printConditions() {
        System.out.println("Введите количество денег, " +
                "количество лет (длительность вклада), процент по вкладку : ");
    }

    protected void printTime(long nanoTime) {
        System.out.println("Время выполнения задачи равно :  "
                + nanoTime + "  наносекунд");
    }

    protected void printLine() {
        System.out.println("___________________________\n");
    }
}
