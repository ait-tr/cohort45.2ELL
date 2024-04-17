public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car volvo = new Car();

        bmw.year = 1991;
        volvo.year = 2024;

        bmw.name = "BMW e34";
        volvo.name = "Volvo 345";

        bmw.owner = "Евгений";
        volvo.owner = "Петр";

        System.out.println(bmw);
        System.out.println(volvo);

        System.out.println(bmw.name);
        System.out.println(volvo.name);

        bmw.startEngine();
        volvo.startEngine();

        volvo.getInfo();

        bmw.startPrice = 5000;
        bmw.countOfCrashes = 5;

        double price = bmw.calculateCurrentPrice();
        System.out.println(price);

        bmw.changeOwner("Владимир");

        System.out.println(bmw.owner);

        bmw.changeOwner("Евгений");

    }
}
