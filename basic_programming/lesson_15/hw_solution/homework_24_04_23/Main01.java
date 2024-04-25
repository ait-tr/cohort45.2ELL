package homework_24_04_23;



import java.time.LocalDate;


public class Main01 {
    public static void main(String[] args) {

        Person alex = new Person("Александр", 47, 176, 4);
        alex.setAge(50);
        alex.setAmountOfChildren(5);
        alex.birthDate = LocalDate.of(1977, 3, 7);

        alex.getInfo();

        alex.setMinSalary(2100);
        alex.setMaxSalary(3500);

        double averageSalaryAlex = alex.calculateAverageSalary();
        System.out.println("Средняя зарплата :  "+ averageSalaryAlex+"  Euro");
        int experienceAlex = alex.calculateExperience();

        System.out.println("Стаж работы :  " + experienceAlex + "  лет");

        alex.toGreet();

        System.out.println("______________________________");
        System.out.println();

        Person polina = new Person("Полина  ", "Moenchengladbach  ", 8,
                "Nettetal  ", 119,
                "Голубые  ", "  Начальная школа");

        polina.birthDate = LocalDate.of(2015, 9, 16);

        polina.getInfoSecond();

        polina.toGreet();
    }
}
