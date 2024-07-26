import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    private static int superRandom;

    @BeforeAll
    public static void start() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int rand = random.nextInt();
            if (rand > 0) {
                superRandom = rand;
            }
        }
    }

    @BeforeEach
    public void init() {
        car = new Car(true);
    }

    @Test
    void destroy_twoCars_success() {
        Car first = new Car(true);
        Car second = new Car(true);


        first.destroy();


        assertNotEquals(first, second);
        assertFalse(first.isOk());
        assertTrue(second.isOk());
    }

    @Test
    void ride_okCar_success() {
        boolean result = car.ride();


        assertTrue(result);
    }

    @Test
    void ride_okSecondCar_success() {
        boolean result = car.ride();


        assertTrue(result);
    }

    @Test
    void ride_notOkCar_success() {
        car.setOk(false);


        boolean result = car.ride();


        assertFalse(result);
    }

    @Test
    void ride_randomTest_success() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            boolean randomBoolean = random.nextBoolean();
            Car randomCar = new Car(randomBoolean);
            boolean result = randomCar.ride();


            assertEquals(randomBoolean, result);
        }
    }



}