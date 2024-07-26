public class MainSecond {

    public static void main(String[] args) {
        Car car = new Car(true);
        System.out.println(car.isOk());
        method(car);
        System.out.println(car.isOk());
    }

    public static void method(Car a) {
        a.setOk(false);
    }
}
