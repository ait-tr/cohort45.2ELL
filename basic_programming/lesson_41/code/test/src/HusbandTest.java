import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HusbandTest {

    private Husband husband = new Husband("Екатерина");

    @Test
    void test() {
        husband.divorce();

        assertNull(husband.getWife());
    }

    @Test
    void test2() {
        Husband husband1 = new Husband(null);
        husband1.merry("Яна");


        assertNotNull(husband1.getWife());
    }

}