package operator;

public enum Operator {

    MULTIPLY("*"),

    DIVIDE("/"),

    SUM("+"),

    SUBTRACTION("-");

    private String value;

    Operator(String value) {
        this.value = value;
    }

    public static Operator findByString(String string) {
        for (Operator operator : Operator.values()) {
            if (operator.value.equals(string)) {
                return operator;
            }
        }

        throw new RuntimeException("Вы ввели неверный знак");
    }
}
