public class Main {

    public static void main(String[] args) {

        //конструктор по умолчанию создает объект с "пустыми" полями
        Cat white = new Cat("Анатолий", "абиссинская", 10);
        Cat black = new Cat("Пушистик", "мейн кун", 3);
        Cat newCat = new Cat("Новая", "Египетская");

        //white.age = 10;
        //white.type = "абиссинская";
        //white.name = "Анатолий";


        System.out.println(Cat.MAX_LIVES);

    }

}
