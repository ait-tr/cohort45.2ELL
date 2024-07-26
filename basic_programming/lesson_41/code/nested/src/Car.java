import java.util.Objects;

public class Car {

    private String name;

    private Engine engine;

    public void ride() {
        System.out.println("Перед поездкой нужно запустить двигатель");
        engine.startEngine();
        System.out.println("Поехали");
    }

    public Car(String name) {
        this.name = name;
        this.engine = new Engine();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(engine);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private class Engine {

        private Engine() {
        }

        private void startEngine() {
            System.out.println("Двигатель запущен");
        }

        private void stopEngine() {
            System.out.println("Двигатель остановлен");
        }
    }


}



