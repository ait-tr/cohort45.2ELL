public class HomeworkSecond {

    public static void main(String[] args) {
        int answer = difference(5, 2);
        System.out.println(answer);

        int[] array = {1, 2, 3, 4};
        int element = getElement(array, 3);
        System.out.println(element);

        int len = getLen("Привет, как дела");
        System.out.println(len);
    }

    public static int difference(int first, int second) {
        return first - second;
    }

    public static int getElement(int[] array, int index) {
        return array[index];
    }

    public static int getLen(String string) {
        return string.length();
    }



    //1. Сделать метод, который принимает два целых числа и ВОЗВРАЩАЕТ их разность
    //
    //2. Сделать метод, который принимает массив и индекс (целое число). Возвращает значение элемента массива,
    // лежащего под этим индексом
    //Пример: method(array, 2) = хочу получить второй элемент из массива array
    //
    //3. Сделать метод, который принимает строку.
    // Этот метод возвращает целое число - длину введеной строки. Как это сделать - найдите самостоятельно


}
