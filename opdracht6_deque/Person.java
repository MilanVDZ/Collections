package opdracht6_deque;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;

    public enum Gender{
        MALE,
        FEMALE,
        OTHERS
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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


    @Override
    public String toString() {
        return "opdracht6_deque.Person{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
