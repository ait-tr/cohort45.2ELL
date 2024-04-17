import java.util.Random;

public class Car {

    int year;
    String name;

    String owner;

    int startPrice;

    int countOfCrashes;

    public void startEngine() {
        int currentYear = 2024;
        int yearsOld = currentYear - year;
        Random random = new Random();
        int randomNumber = random.nextInt(0, 100);
        if (randomNumber > (50 + yearsOld)) {
            System.out.println(name + " запустила двигатель, ее владелец " + owner);
        } else {
            System.out.println(name + " не запустила двигатель, ее владелец " + owner);
        }
    }

    public void getInfo() {
        System.out.println("--------------------");
        System.out.println("Владелец - " + owner);
        System.out.println("Имя машины - " + name);
        System.out.println("Год выпуска - " + year);
        System.out.println("--------------------");
    }

    public double calculateCurrentPrice() {
        double forOneCrash = 0.1;
        double decreasePrice = forOneCrash * countOfCrashes;
        double currentPrice = startPrice - decreasePrice * startPrice;
        return currentPrice;
    }

    public void changeOwner(String nameOfNewOwner) {
        System.out.println("Новый владелец автомобиля: " + nameOfNewOwner);
        owner = nameOfNewOwner;
        System.out.println("Сделка успешно проведена!");
    }

}



//поля - характеристики
//методы - действия
