package opdacht8_sort;

public class Person {
    private String name;
    private double weight;

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int compareTo(Person o) {
        int last = name.compareTo(o.name);
        return last;
    }
    @Override


    public String toString() {
        return "Name: " + name + " | " + "Weight: " + weight + "kg";
    }
}
