import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThirdTask {

    public static void main(String[] args) {
        Map<String, List<City>> map = new HashMap<>();


        List<City> list = new ArrayList<>();
        list.add(new City("Санкт-Петербург", 100));
        list.add(new City("Баку", 1));
        list.add(new City("Каракас", 1));
        list.add(new City("Москва", 20));
        list.add(new City("Великий Новгород", 1));

        map.put("Даниил", list);

        List<City> cities = map.get("Даниил");
        cities.add(new City("НН", 1));

        System.out.println(map);


        List<City> secondList = new ArrayList<>();
        secondList.add(new City("Perth", 10));
        secondList.add(new City("Бишкек", 1));
        secondList.add(new City("Абу Даби", 1));
        secondList.add(new City("Канберра", 20));
        secondList.add(new City("Гамбург", 5));

        map.put("Умут", secondList);


        System.out.println(map);



    }
}
