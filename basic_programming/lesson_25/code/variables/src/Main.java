public class Main {

    public static void main(String[] args) {
        //, 89, 103, 145, 203, 304, 404
        int[] array = {4, 5, 10}; //13
        int result = binarySearch(array, 6, 0, array.length - 1);
        System.out.println(result);
    }

    //у меня был не-сорт. массив, я его сорт. и искал бинарным поиском (+-)
    //вместо линейного

    //O(n^2)+(O(ln (n)) = O(n^2)

    //O(n) = O(n)



    //нужен алгоритм, который постоянно выбирает центральный элемент массива,
    //и в зависимости от результата конкретной ячейки убирает из поиска половину заданного массива
    public static int binarySearch(int[] array, int number, int start, int finish) {
        int index = -1;

        int median = (start + finish) / 2;

        if (array[median] == number) {
            index = median;
        }

        if (start == finish && array[median] != number) {
            return -1;
        }

        if (array[median] > number) {
            index = binarySearch(array, number, start, median - 1);
        }

        if (array[median] < number) {
            index = binarySearch(array, number, median + 1, finish);
        }

        return index;
    }
}
