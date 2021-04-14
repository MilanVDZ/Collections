package opdracht2_hashset;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private double weight;
    private double height;

    public enum Gender{
        MALE,
        FEMALE
    }

    public Person(String firstName, String lastName, Gender gender, int age, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "Your first name is: " + firstName + ", your last name is: " + lastName + ", your gender is" + gender +
                ", your age is: " + age + ", your weight is: " + weight + ", your height is: " + height;
    }
}
