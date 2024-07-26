public class Car {

    private boolean isOk;

    public boolean ride() {
        if (isOk) {
            System.out.println("Машина поехала");
            return true;
        }
        else {
            return false;
        }
    }

    public void destroy() {
        isOk = false;
    }

    public Car(boolean isOk) {
        this.isOk = isOk;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isOk=" + isOk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return isOk == car.isOk;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(isOk);
    }
}
