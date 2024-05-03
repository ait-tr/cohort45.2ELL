package homework_24_05_01;


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

        PensionFund pensionFundAlex = new PensionFund();
        pensionFundAlex.calculatePension(alex);
        System.out.println("По достижении возраста 67 лет пенсия будет составлять :  "
                + pensionFundAlex.calculatePension(alex) + "  Euro");
        System.out.println("______________________________");
        System.out.println();

        Person elena = new Worker("Elena ", 43, 166, 4);
        elena.birthDate = LocalDate.of(1980, 10, 11);

        elena.getInfo();

        int experienceElena = elena.calculateExperience();
        System.out.println("Стаж работы :  " + experienceElena + "  лет");

        elena.setMinSalary(1700);
        elena.setMaxSalary(2200);
        System.out.println("Средняя зарплата :  " + elena.calculateAverageSalary() + "  Euro");

        PensionFund pensionFundElena = new PensionFund();
        pensionFundElena.calculatePension(elena);
        System.out.println("По достижении возраста 67 лет пенсия будет составлять :  "
                + pensionFundElena.calculatePension(elena) + "  Euro");
        System.out.println("______________________________");
        System.out.println();

        Person peter = new Pensioner("Peter", 73, 180, 2);
        peter.birthDate = LocalDate.of(1951, 2, 17);

        peter.getInfo();

        int experiencePeter = peter.calculateExperience();
        System.out.println("Стаж работы :  " + experiencePeter + "  лет");

        peter.setMinSalary(1727);
        peter.setMaxSalary(1970);
        System.out.println("Средняя зарплата :  " + peter.calculateAverageSalary() + "  Euro");

        PensionFund pensionFundPeter = new PensionFund();
        pensionFundPeter.calculatePension(peter);
        System.out.println("После расчёта пенсия составляет :  "
                + pensionFundPeter.calculatePension(peter) + "  Euro");

        System.out.println("______________________________");

        Person masha = new Pensioner("Masha", 70, 170, 0);
        masha.birthDate = LocalDate.of(1954, 4, 25);

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
