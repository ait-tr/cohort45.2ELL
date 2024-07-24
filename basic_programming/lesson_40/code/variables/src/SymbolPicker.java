public class SymbolPicker {

    public char pick(String string, int index) {

        if (string == null) {
            return ' ';
        }

        if (index >= string.length() || index < 0) {
            return ' ';
        }

        System.out.println(string.charAt(index));

        return string.charAt(index);
    }
}
