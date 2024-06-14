import java.util.Objects;
import java.util.Random;

public class Something implements Comparable<Something> {

    private String name;

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Something o) {
        return name.compareTo(o.name);
    }
}
