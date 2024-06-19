import java.util.*;

public class SecondMain {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Сидоров", 5);
        map.put("Петров", 3);
        map.put("Иванов", 2);

        Set<String> set = map.keySet(); //получения множества всех ключей
        Collection<Integer> collection = map.values(); //получение коллекции из всех значений
        System.out.println(set);

        for (String string : set) { //проход через цикл for-each по всем ключам и нахождение по этим ключам связанных значений
            Integer a = map.get(string);
            System.out.println(a);
        }

        for (Integer i : collection) { //проход по всем значения мапы
            System.out.println(i);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) { //проход по всем "записям" мапы (объединение ключа и значения)
            System.out.println("У пользователя " + entry.getKey() + " стоит оценка " + entry.getValue());
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    }
}
