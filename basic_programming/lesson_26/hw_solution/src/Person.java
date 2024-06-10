import java.time.LocalDate;
import java.util.Objects;

public class Person extends UserValidation {
    private String firstName;
    private String lastName;
    private int age;
    private LocalDate birthDate;
    private Role role;

    public Person() {

    }

    public Person(String firstName, String lastName, int age,
                  LocalDate birthDate, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
        this.role = role;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(birthDate, person.birthDate) && role == person.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, birthDate, role);
    }

    @Override
    public String toString() {
        return "\nPerson\n\n" +
                "First name:  " + firstName +
                "\nLast name:  " + lastName +
                "\nAge:  " + age +
                "\nBirth date:  " + birthDate +
                "\nUser type:  " + role
                + "\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}