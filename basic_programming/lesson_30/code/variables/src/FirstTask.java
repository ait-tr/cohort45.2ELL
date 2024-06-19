import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        //есть некоторое количество ученых, каждый из них вводит свое имя и температуру, которою ему удалось замерить
        //найдите наибольшую температуру и назовите человека, который этю температуру замерил

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("exit")) {
                break;
            }

            String[] array = string.split(" ");

            String name = array[0];
            int temperature = Integer.parseInt(array[1]);
            map.put(name, temperature);
        }

        int max = Integer.MIN_VALUE;
        String nameOfMaxValue = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                nameOfMaxValue = entry.getKey();
            }
        }

        System.out.println(max);
        System.out.println(nameOfMaxValue);


    }
}
