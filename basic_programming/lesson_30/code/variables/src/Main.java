import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (String string : list) {

        }

        for (String string : set) {

        }

        set.add("Сидоров");
        set.add("Петров");
        set.add("Иванов");

        Map<String, Integer> map = new HashMap<>();

        map.put("Сидоров", 2);
        map.put("Петров", 2);
        map.put("Иванов", 2);
        map.put(null, 3);
        map.put("", 2);
        map.put(" ", 5);

        System.out.println(map);

        Integer result = map.get("Сидоров");
        System.out.println(result);

        Integer answer = map.get("Сидорова");
        System.out.println(answer);


    }
}
