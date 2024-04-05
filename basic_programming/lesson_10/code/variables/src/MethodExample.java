public class MethodExample {

    public static void main(String[] args) {
        String[] names = {"Петр", "Иван", "Ганс"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int number = i + 1;
            print(name, number);
        }
    }

    public static void print(String s, int number) {
        System.out.println("Иииитак, мы выводим человека под номером " + number);
        System.out.println(s);
        System.out.println("Вот мы вывели нового человека");
        System.out.println("Удивительно");
        System.out.println("-------------------------");
    }

}
