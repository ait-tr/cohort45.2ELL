public enum OperationType {

    CREDIT("Кредит для всех", 1.06),
    MORTGAGE("Выгодная ипотека", 1.05),
    DEBIT("Сберегательный", 1.04),
    UNKNOWN("Неизвестная", 1.0);


    private String name;
    private double creditRate;

    OperationType(String name, double creditRate) {
        this.name = name;
        this.creditRate = creditRate;
    }

    public String getName() {
        return name;
    }

    public double getCreditRate() {
        return creditRate;
    }
}
