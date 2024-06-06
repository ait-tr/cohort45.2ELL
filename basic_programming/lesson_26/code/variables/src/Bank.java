import java.util.Objects;

public class Bank {

    private long id;

    private String name;

    public Bank(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public BankOperation createOperation(Person person, OperationType operationType, double amount) {
        if (person == null) {
            return null;
        }

        if (person.getCategory() == AgeCategory.CHILD
                || (person.getCategory() == AgeCategory.TEEN && operationType != OperationType.DEBIT)) {
            return null;
        }

        BankOperation bankOperation = new BankOperation(0, amount, id, person.getId(), operationType);

        return bankOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (id != bank.id) return false;
        return Objects.equals(name, bank.name);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
