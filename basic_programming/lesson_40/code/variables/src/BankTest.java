import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void saveDeposit_positiveNumbers_success() {
        Bank bank = new Bank();
        double amount = 1000.0;
        int year = 1;
        double rate = 1.10;


        double result = bank.saveDeposit(amount, year, rate);


        assertEquals(1100, result);
    }

    @Test
    public void saveDeposit_negativeNumbers_throwException() {
        Bank bank = new Bank();
        double amount = 1000.0;
        int year = -1;
        double rate = 1.10;


        assertThrows(RuntimeException.class, () -> bank.saveDeposit(amount, year, rate));
    }
}