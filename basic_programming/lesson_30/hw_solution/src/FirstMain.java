import java.util.*;

public class FirstMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Map<String, Integer> frequencyMap = new HashMap<>();

        System.out.println("Введите поисковый запрос (введите 'exit', чтобы выйти):  ");

        while (true) {
            String string = scanner.nextLine();
            if (string.equals("exit")) {
                break;
            }
            list.add(string);
            frequencyMap.put(string, frequencyMap.getOrDefault(string, 0) + 1);

        }

        System.out.println("Запросы : " + list + "\nобщее количество запросов :  " + list.size());
        System.out.println("\nЧастота повторения запросов :");

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            int max = 100;
            if (entry.getValue() > max) {
                frequencyMap.put(entry.getKey(), max);
            }
            System.out.println("Запрос  " + entry.getKey() + "  Количество повторений :  " + entry.getValue());
        }
    }
}
