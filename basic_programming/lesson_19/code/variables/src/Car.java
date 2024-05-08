import java.util.Objects;

public class Car {

    private int number;

    private String name;

    private String type;

    private int maxKph;

    public Car(int number, String name, String type, int maxKph) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.maxKph = maxKph;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (number != car.number) return false;
        if (maxKph != car.maxKph) return false;
        if (!Objects.equals(name, car.name)) return false;
        return Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + maxKph;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "номер=" + number +
                ", имя='" + name + '\'' +
                ", тип='" + type + '\'' +
                ", макс. скорость=" + maxKph +
                '}';
    }

    //в hashcode - существует коллизия, это когда два разных объекта отдают одно и то же число (хэшкод)


    //контракт hashcode и equals
    //если объекты равны, то хэшкоды всегда равны
    //если объекты не равны, то ничего точно сказать о хэшкоде точно нельзя (99,999999% - хэшкоды не равны тоже, но бывают коллизии)

    //если хэшкоды равны, то ничего точно сказать о объектах нельзя (99,999999% - объекты равны тоже, но бывают коллизии хэшкодов)
    //если хэшкоды не равны, то объекты всегда не равны
}
