import java.util.Objects;

public class City {

    private String name;

    private int numberOfTimes;

    public City(String name, int numberOfTimes) {
        this.name = name;
        this.numberOfTimes = numberOfTimes;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", numberOfTimes=" + numberOfTimes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (numberOfTimes != city.numberOfTimes) return false;
        return Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + numberOfTimes;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTimes() {
        return numberOfTimes;
    }

    public void setNumberOfTimes(int numberOfTimes) {
        this.numberOfTimes = numberOfTimes;
    }
}
