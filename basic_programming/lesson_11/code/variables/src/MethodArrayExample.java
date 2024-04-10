public class MethodArrayExample {

    public static void main(String[] args) {
        int[] array = {2, 5, -6, 4, 6, 7}; //18
        int sumValues = 0;
        int sumIndexes = 0;

        for (int index = 0; index < array.length; index++) {
            sumValues += array[index]; //получил сумму значений ячеек
            sumIndexes += index; //получил сумму индексов всех ячеек
        }

        System.out.println(sumValues);
        System.out.println(sumIndexes);


        int index = 2;

        System.out.println(array[index]);
        System.out.println(index);

    }


}
