public class FirstTask {

    public static void main(String[] args) {
        //byte = очень малые целые числа (не используем)
        //short = малые целые числа (не используем)
        //int = целые числа
        //long = очень большие целые числа

        //double = дробные числа
        //float = дробные числа, но не меньшей точностью (не используем)

        //Я бегу 42 километра, за один километр сжигается 50 калорий.
        //1) Сколько я сожгу калорий?
        //2) Сколько мне нужно бургеров сьесть, чтобы покрыть эти расходы (1 бургер - 800 калорий)

        int km = 42;
        int energy = 50;

        int answer = km * energy;

        System.out.println("Калорий было потрачено: " + answer + " калорий");

        double energyInBurger = 800.0;

        double burgers = answer / energyInBurger;

        System.out.println("Бургеров надо съесть: " + burgers);

        //2,625

        long humanity = 8_000_000_000L;

        long result = humanity * answer;

        System.out.println("Все человечество потратит: " + result);

        float abc = 4.5F;

        //в мире 5 миллиардов звезд,
        // вокруг каждой из них в среднем обращается 4 планеты. Сколько планет в мире?

        //Обед в школе стоит 5 евро, сколько надо дать ребенку на месяц,
        // если он учится 21 день в месяц.




    }
}