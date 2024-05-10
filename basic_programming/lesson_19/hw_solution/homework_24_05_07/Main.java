package homework_24_05_07;


import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Person alex = new Worker("Alex ", 47, 176, 4, LocalDate.of(1977, 3, 7));

        alex.toGreet();

        alex.getInfo();

        int experienceAlex = alex.calculateExperience();
        System.out.println("Стаж работы :  " + experienceAlex + "  лет");

        alex.setMinSalary(2150);
        alex.setMaxSalary(3520);
        System.out.println("Средняя зарплата :  " + alex.calculateAverageSalary() + "  Euro");

        PensionFund pensionFundAlex = new PensionFund();
        pensionFundAlex.calculatePension(alex);
        System.out.println("По достижении возраста 67 лет пенсия будет составлять :  "
                + pensionFundAlex.calculatePension(alex) + "  Euro");

        System.out.println("______________________________");
        System.out.println();

        Person masha = new Pensioner("Masha", 70, 170, 0, LocalDate.of(1954, 4, 25));

        masha.toGreet();

        masha.getInfo();

        int experienceMasha = masha.calculateExperience();
        System.out.println("Стаж работы :  " + experienceMasha + "  лет");

        masha.setMinSalary(1287);
        masha.setMaxSalary(1564);
        System.out.println("Средняя зарплата :  " + masha.calculateAverageSalary() + "  Euro");

        PensionFund pensionFundMasha = new PensionFund();
        pensionFundMasha.calculatePension(masha);
        System.out.println("После расчёта пенсия составляет :  "
                + pensionFundMasha.calculatePension(masha) + "  Euro");

        System.out.println("______________________________");

    }
}
