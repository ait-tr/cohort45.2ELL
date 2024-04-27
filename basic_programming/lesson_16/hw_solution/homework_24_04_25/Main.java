package homework_24_04_25;


import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Person alex = new Worker("Alex ", 47, 176, 4);
        alex.birthDate = LocalDate.of(1977, 3, 7);

        alex.getInfo();

        int experienceAlex = alex.calculateExperience();
        System.out.println("Стаж работы :  " + experienceAlex + "  лет");

        alex.setMinSalary(2150);
        alex.setMaxSalary(3520);
        System.out.println("Средняя зарплата :  " + alex.calculateAverageSalary() + "  Euro");

        System.out.println("______________________________");
        System.out.println();

        Person peter = new Pensioner("Peter ", 67, 180, 2);
        peter.birthDate = LocalDate.of(1957, 2, 17);

        peter.getInfo();

        int experiencePeter = peter.calculateExperience();
        System.out.println("Стаж работы :  " + experiencePeter + "  лет");

        peter.setMinSalary(1751);
        peter.setMaxSalary(1970);
        System.out.println("Итоговая пенсия :  " + peter.calculateAverageSalary() + "  Euro");

        System.out.println("______________________________");
    }
}
