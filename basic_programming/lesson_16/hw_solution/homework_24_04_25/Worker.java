package homework_24_04_25;

public class Worker extends Person {
    public Worker(String name, int age, int height, int amountOfChildren) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.amountOfChildren = amountOfChildren;


    }

    @Override
    double calculateAverageSalary() {
        double averageSalary = CalculatorUtils.averageOfTwo(minSalary, maxSalary);
        return averageSalary;
    }
}
