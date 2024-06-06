import java.util.Objects;

public class Person {

    private long id;

    private String name;

    private AgeCategory category;

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.category = AgeCategory.getCategoryByAge(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (!Objects.equals(name, person.name)) return false;
        return category == person.category;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
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

    public AgeCategory getCategory() {
        return category;
    }

    public void setCategory(AgeCategory category) {
        this.category = category;
    }
}
