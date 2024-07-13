import java.util.Objects;

public class Person {
    private String name;
    private String mom;
    private String dad;

    public Person() {
    }

    public Person(String name, String mom, String dad) {
        this.name = name;
        this.mom = mom;
        this.dad = dad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + name + '\'' +
                ", Mom='" + mom + '\'' +
                ", Dad='" + dad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name)
                && Objects.equals(mom, person.mom)
                && Objects.equals(dad, person.dad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mom, dad);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMom() {
        return mom;
    }

    public void setMom(String mom) {
        this.mom = mom;
    }

    public String getDad() {
        return dad;
    }

    public void setDad(String dad) {
        this.dad = dad;
    }
}
