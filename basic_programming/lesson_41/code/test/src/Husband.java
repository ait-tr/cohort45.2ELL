import java.util.Objects;

public class Husband {

    private String wife;

    public void divorce() {
        wife = null;
    }

    public void merry(String name) {
        wife = name;
    }

    public Husband(String wife) {
        this.wife = wife;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "wife='" + wife + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Husband husband = (Husband) o;
        return Objects.equals(wife, husband.wife);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(wife);
    }
}
