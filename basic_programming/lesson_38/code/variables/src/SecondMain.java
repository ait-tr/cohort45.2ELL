package hello;

import java.util.Random;

public class SecondMain {

    public static void main(String[] args) {
        Random random = new Random();
        boolean isNotOk = random.nextBoolean();

        if (isNotOk) {
            throw new RuntimeException();
        }
    }
}
