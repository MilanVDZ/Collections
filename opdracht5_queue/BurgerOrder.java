package opdracht5_queue;

public class BurgerOrder {
    private String name;
    private int number;

    public BurgerOrder(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public BurgerOrder() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
