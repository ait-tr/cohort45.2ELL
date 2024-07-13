import java.util.Objects;

public class Car {

    private String name;
    private  int manufactureYear;
    private int mileage;

    public Car() {
    }

    public Car(String name, int manufactureYear, int mileage) {
        this.name = name;
        this.manufactureYear = manufactureYear;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Marke='" + name + '\'' +
                ", Year of manufacture=" + manufactureYear +
                ", Mileage=" + mileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufactureYear == car.manufactureYear
                && mileage == car.mileage
                && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufactureYear, mileage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
