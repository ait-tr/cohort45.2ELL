package homework_24_05_01;

public class Pensioner extends Person {
    private static final double CONSTANT_VALUE_FOR_ALL_PENSIONERS = 2000;
    int age = getAge();

    public Pensioner(String name, int age, int height, int amountOfChildren) {
        super(name, age, height, amountOfChildren);
    }


    @Override
    public int calculateExperience() {
        int experience;
        if (age < 67) {
            experience = age - ADULTHOOD;
        } else {
            experience = 49;
        }
        return experience;
    }

    @Override
    public double calculateAverageSalary() {
        double minSalary = getMinSalary();
        double maxSalary = getMaxSalary();
        return CalculatorUtils.averageOfThree(minSalary, maxSalary, CONSTANT_VALUE_FOR_ALL_PENSIONERS);
    }
}
