import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Car volvo = new Car("Volvo");
        volvo.ride();

        Calculator.Multiplicator multiplicator = new Calculator.Multiplicator();
        Calculator.Divider divider = new Calculator.Divider();

        int a = multiplicator.multiply(5, 4);
        System.out.println(a);

    }
}
