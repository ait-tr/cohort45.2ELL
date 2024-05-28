package homework_24_05_17;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Worker alex = new Worker("Alex ", 47, 176, 4,
                LocalDate.of(1977, 3, 7));

        alex.toGreet();
        alex.getInfo();

        int experienceAlex = alex.calculateExperience();
        System.out.println("Стаж работы :  " + experienceAlex + "  лет");

        alex.setMinSalary(2220);
        alex.setMaxSalary(3540);
        System.out.println("Средняя зарплата :  " + alex.calculateAverageSalary() + "  Euro");

        PensionFund pensionFundAlex = new PensionFund("Deutsche-Rentenversicherung",
                23000000, LocalDate.of(2005, 1, 1));
        pensionFundAlex.calculatePension(alex);

        System.out.println(pensionFundAlex.toString());

        System.out.println("По достижении возраста 67 лет пенсия будет составлять :  "
                + pensionFundAlex.calculatePension(alex) + "  Euro");

        alex.goToWork();

        System.out.println("______________________________");
        System.out.println();

        Pensioner masha = new Pensioner("Masha", 70, 170, 0,
                LocalDate.of(1954, 4, 25));

        masha.toGreet();
        masha.getInfo();
        //System.out.println(masha);                                                      //  добавлено 24.05.2024

        int experienceMasha = masha.calculateExperience();
        System.out.println("Стаж работы :  " + experienceMasha + "  лет");

        masha.setMinSalary(1287);
        masha.setMaxSalary(1564);
        System.out.println("Средняя зарплата :  " + masha.calculateAverageSalary() + "  Euro");

        PensionFund pensionFundMasha = new PensionFund();
        pensionFundMasha.calculatePension(masha);
        System.out.println("После расчёта пенсия составляет :  "
                + pensionFundMasha.calculatePension(masha) + "  Euro");

        masha.goToWork();

        System.out.println("______________________________");
        System.out.println();

        Teenager sasha = new Teenager("Sasha",
                "Учёба в \"Clara Schumann Gymnasium\" 10 класс",
                16, LocalDate.of(2007, 10, 30),
                "Баскетбол, плаванье ");

        sasha.toGreet();
        sasha.getSecondInfo();
        //System.out.println(sasha);                                                      //  добавлено 24.05.2024
        //String string = sasha.toString();                                               //  добавлено 25.05.2024
        //System.out.println(string);                                                     //  добавлено 25.05.2024


        System.out.println("Спорт :  " + sasha.getSport());

        int experienceSasha = sasha.calculateExperience();
        System.out.println("Стаж работы :  " + experienceSasha + "  лет");

        System.out.println("Средняя зарплата :  " + sasha.calculateAverageSalary() + "  Euro");

        System.out.println("______________________________");
    }
}
