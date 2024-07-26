import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestForTest {

    @BeforeAll
    public static void start() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    public void init() {
        System.out.println("BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

}
