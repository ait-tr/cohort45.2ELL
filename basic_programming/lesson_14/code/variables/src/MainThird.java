import java.util.Arrays;

public class MainThird {

    public static void main(String[] args) {

        String[] names = {"Белыш", "Черныш", "Серый", "Моська", "Болтун"};
        String[] types = {"Абиссинская", "Cфинкс", "Сибирская", "Сиамская", "Персидская"};

        Cat[] cats = new Cat[5];

        for (int i = 0; i < cats.length; i++) {
            String name = names[i];
            String type = types[i];

            cats[i] = new Cat(name, type, i * 5);
        }

        System.out.println(Arrays.toString(cats));


    }
}
