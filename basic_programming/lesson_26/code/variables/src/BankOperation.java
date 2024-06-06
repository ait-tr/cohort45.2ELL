public class BankOperation {

    private long id;

    private double amount;

    private long fromId;

    private long toId;

    private OperationType type;

    public BankOperation(long id, double amount, long fromId, long toId, OperationType type) {
        this.id = id;
        this.amount = amount;
        this.fromId = fromId;
        this.toId = toId;
        this.type = type;
    }

    public double calculateCreditRate() {
        if (type != null) {
            return type.getCreditRate();
        }

        return OperationType.UNKNOWN.getCreditRate();
    }

    public void printInfo() {
        switch (type) {
            case DEBIT:
                System.out.println("Это мы положили деньги в банк");
                break;
            case MORTGAGE:
                System.out.println("Ура, я живу не на улице");
                break;
            case CREDIT:
                System.out.println("Кредит, ок");
                break;
        }
    }

    @Override
    public String toString() {
        return "BankOperation{" +
                "id=" + id +
                ", amount=" + amount +
                ", fromId=" + fromId +
                ", toId=" + toId +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankOperation that = (BankOperation) o;

        if (id != that.id) return false;
        if (Double.compare(amount, that.amount) != 0) return false;
        if (fromId != that.fromId) return false;
        if (toId != that.toId) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (fromId ^ (fromId >>> 32));
        result = 31 * result + (int) (toId ^ (toId >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getFromId() {
        return fromId;
    }

    public void setFromId(long fromId) {
        this.fromId = fromId;
    }

    public long getToId() {
        return toId;
    }

    public void setToId(long toId) {
        this.toId = toId;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }
}
