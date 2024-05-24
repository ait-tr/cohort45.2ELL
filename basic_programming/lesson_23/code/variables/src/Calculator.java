public class Calculator {

    public int findInArray(int[] array, int numberToFind) {
        //O(1) - лучший случай
        //O(n) - средний случай 99,99999999%
        //O(n) - худший случай

        // Лучший случай, средний случай, худший случай
        //
        //
        // O(n)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                return i;
            }
        }

        return -1;

        //
    }
}
