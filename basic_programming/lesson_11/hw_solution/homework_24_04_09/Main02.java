package homework_24_04_09;

/*
Сделать метод, который принимает массив и индекс (целое число).
Возвращает значение элемента массива, лежащего под этим индексом
 */
public class Main02 {
    public static int returnNumber(int[] array, int num) {

        for (int i = 0; i < array.length; i++) {

        }
        return array[num];
    }

    public static void main(String[] args) {
        int[] array = {9, 88, 7, 66, 5, 44, 3, 22, 1};
        System.out.println(returnNumber(array, 5));
        System.out.println(returnNumber(array, 4));
        System.out.println(returnNumber(array, 3));
    }
}
