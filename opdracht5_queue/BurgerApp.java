package opdracht5_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class BurgerApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> list = new LinkedList<>(); // PriorityQueue --> zet bestellingen in alfabetische order

        list.offer(new BurgerOrder("Bacon Burgers", 5));
        list.offer(new BurgerOrder("Cheese Burgers", 4));
        list.offer(new BurgerOrder("Chicken Burgers", 3));
        list.offer(new BurgerOrder("McChicken's", 2));
        list.offer(new BurgerOrder("CBO", 1));

        BurgerOrder s = list.peek();
        while (s != null){
            System.out.println("About to handle " + s.getNumber() + " " + s.getName());
            s = list.poll();
            System.out.println("Handling "  + s.getNumber() + " " + s.getName());
            s = list.peek();
        }
    }
}
