package homework_24_04_16;
//Сделать класс Человек
//Добавить ему поля:

//1. Имя
//2. Возраст
//3. Рост
//4. Количество детей
//5. Дата рождения (можно сделать строкой, но можно найти специальный тип для этого)

//Добавить методы

//1) Вывод Info по человеку
//2) Расчет стажа человека (возраст - 18 лет)
//3) Метод, в котором человек "здоровается"
//Потренироваться
//Создать несколько людей (заполнить их разными данными, повызывать методы)

import java.time.LocalDate;

public class Main01 {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name = "Александр";
        alex.age = 47;
        alex.height = 176;
        alex.amountOfChildren = 4;
        alex.birthDate = LocalDate.of(1977, 3, 7);
        alex.getInfo();
        int experienceAlex = alex.calculateExperience();
        System.out.println("Стаж работы :  " + experienceAlex + "  лет");
        alex.toGreet();
        Person elena = new Person();
        elena.name = "Елена";
        elena.age = 37;
        elena.height = 166;
        elena.amountOfChildren = 4;
        elena.birthDate = LocalDate.of(1987, 1, 11);
        elena.getInfo();
        int experienceElena = elena.calculateExperience();
        System.out.println("Стаж работы :  " + experienceElena + "  лет");
        elena.toGreet();
        Person viktor = new Person();
        viktor.name = "Виктор";
        viktor.age = 24;
        viktor.height = 172;
        viktor.amountOfChildren = 1;
        viktor.birthDate = LocalDate.of(2000, 1, 12);
        viktor.getInfo();
        int experienceViktor = viktor.calculateExperience();
        System.out.println("Стаж работы :  " + experienceViktor + "  лет");
        viktor.toGreet();
        Person alexey = new Person();
        alexey.name = "Алексей";
        alexey.age = 23;
        alexey.height = 178;
        alexey.amountOfChildren = 0;
        alexey.birthDate = LocalDate.of(2001, 2, 24);
        alexey.getInfo();
        int experienceAlexey = alexey.calculateExperience();
        System.out.println("Стаж работы :  " + experienceAlexey + "  лет");
        alexey.toGreet();
    }
}
