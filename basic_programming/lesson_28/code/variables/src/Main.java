import java.util.*;

public class Main {

    //Есть список оценок учеников
    //посчитайте среднее значени оценок
    //найдите оценку, котора является второй среди самых лучших
    //система 100-бальная
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(1,101);
            list.add(number);
        }

        System.out.println(list);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            //int element = list.get(i);
            //sum += element;
        }

        System.out.println(sum / list.size());

        list.set(0, 100);

        System.out.println(list);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

            int element = list.get(i);
            if (element > max) {
                secondMax = max;
                max = element;
            } else if (element > secondMax) {
                secondMax = element;
            }
        }

        System.out.println(max);
        System.out.println(secondMax);





    }
}
