package opdracht4_treeset;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreesetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words: ");
        NavigableSet<String> woorden = new TreeSet<>();

        String woord;
        for (int i = 0; i < 5; i++) {
            woord = scanner.nextLine();
            woorden.add(woord);
        }
        System.out.println(woorden);

        System.out.println();

        System.out.println("Het eerste alfabetische woord is: " + woorden.pollFirst());
        System.out.println("Het laatste alfabetische woord is: " + woorden.pollLast());

        //Dubbele woorden worden niet ageprint
    }
}
