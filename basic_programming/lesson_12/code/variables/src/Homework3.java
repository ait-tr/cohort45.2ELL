public class Homework3 {

    //    //    3. Создать массив, заполнить его любым образом. Найти количество элементов в массиве, которые больше, чем их соседи слева.
    //    //    Сосед слева - элемент, который располагается ДО текущего элемента
    //    //    Пример : [1, 5, 3, 7, 11] - Ответ: 3
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 11};
        int count = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
