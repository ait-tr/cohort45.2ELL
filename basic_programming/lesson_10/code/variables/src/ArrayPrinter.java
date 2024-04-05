public class ArrayPrinter {

    public static void main(String[] args) {
        int[] a = {45, 76, 23, 12, 34};
        int[] b = {78, 56, 45, 34, 10};
        int[] c = {34, 56, 34};

        //каждый массив вывести на экран поэлементно
        //1. Перед выводом написать "сейчас я буду печать на экран массив"
        //2. в конце написать "Печать окончена"

        System.out.println("Сейчас я буду печатать на экран массив");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Печать окончена");

        System.out.println("Сейчас я буду печатать на экран массив");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("Печать окончена");

        System.out.println("Сейчас я буду печатать на экран массив");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println("Печать окончена");
    }
}
