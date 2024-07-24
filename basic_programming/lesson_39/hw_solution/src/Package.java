import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Package {
    private String departureCity;
    private String cityOfReceipt;
    private double weight;
    private ZonedDateTime creationDateTime;

    public Package(String departureCity, String cityOfReceipt, double weight,
                   ZonedDateTime creationDateTime) {
        this.departureCity = departureCity;
        this.cityOfReceipt = cityOfReceipt;
        this.weight = weight;
        this.creationDateTime = creationDateTime;
    }

    public Instant getCreationDateTimeInUTC() {
        return creationDateTime.toInstant();
    }

    @Override
    public String toString() {
        return "Package{" +
                "departureCity='" + departureCity + '\'' +
                ", cityOfReceipt='" + cityOfReceipt + '\'' +
                ", weight=" + weight +
                ", creationDateTime=" + creationDateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return Double.compare(weight, aPackage.weight) == 0
                && Objects.equals(departureCity, aPackage.departureCity)
                && Objects.equals(cityOfReceipt, aPackage.cityOfReceipt)
                && Objects.equals(creationDateTime, aPackage.creationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, cityOfReceipt, weight, creationDateTime);
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getCityOfReceipt() {
        return cityOfReceipt;
    }

    public void setCityOfReceipt(String cityOfReceipt) {
        this.cityOfReceipt = cityOfReceipt;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ZonedDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(ZonedDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
}
