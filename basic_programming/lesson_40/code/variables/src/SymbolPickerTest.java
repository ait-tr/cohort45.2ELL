import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymbolPickerTest {

    private final SymbolPicker symbolPicker = new SymbolPicker();

    @Test
    public void pick_okData_success() {
        char symbol = symbolPicker.pick("Даниил", 0);


        assertEquals('Д', symbol);
    }

    @Test
    public void pick_indexMoreThanStringSize_success() {
        char symbol = symbolPicker.pick("Даниил", 15);


        assertEquals(' ', symbol);
    }

    @Test
    public void pick_indexBelowZero_success() {
        char symbol = symbolPicker.pick("Даниил", -1);


        assertEquals(' ', symbol);
    }

    @Test
    public void pick_stringIsNull_success() {
        char symbol = symbolPicker.pick(null, -1);


        assertEquals(' ', symbol);
    }

}