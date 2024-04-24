package homework_24_04_18;
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

//Задание от 24.04.18
//1. Добавить конструктор, который заполняет все поля объекта
//2. Создать пустой конструктор
//3. Сделать свой любой произвольный конструктор (*)

//Число 18 из метода по расчету стажа вынести как КОНСТАНТУ

import java.time.LocalDate;
//import java.time.Period;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Main01 {
    public static void main(String[] args) {
        Person alex = new Person("Александр", 47, 176, 4);
        alex.birthDate = LocalDate.of(1977, 3, 7);
        alex.getInfo();
        int experienceAlex = alex.calculateExperience();
        System.out.println("Стаж работы :  " + experienceAlex + "  лет");
        alex.toGreet();
        Person elena = new Person("Елена", 37, 166, 4);
        elena.birthDate = LocalDate.of(1987, 1, 11);
        elena.getInfo();
        int experienceElena = elena.calculateExperience();
        System.out.println("Стаж работы :  " + experienceElena + "  лет");
        elena.toGreet();
        Person viktor = new Person("Виктор", 24, 172, 1);
        viktor.birthDate = LocalDate.of(2000, 1, 12);
        viktor.getInfo();
        int experienceViktor = viktor.calculateExperience();
        System.out.println("Стаж работы :  " + experienceViktor + "  лет");
        viktor.toGreet();
        Person alexey = new Person("Алексей", 23, 178, 0);
        alexey.birthDate = LocalDate.of(2001, 2, 24);
        alexey.getInfo();
        int experienceAlexey = alexey.calculateExperience();
        System.out.println("Стаж работы :  " + experienceAlexey + "  лет");
        alexey.toGreet();
        Person polina = new Person("Полина  ", "Moenchengladbach  ", 8,
                "Nettetal  ", 119,
                "Blue  ", "  School");
        polina.birthDate = LocalDate.of(2015, 9, 16);
        polina.getInfoSecond();
        polina.toGreet();
    }
}
