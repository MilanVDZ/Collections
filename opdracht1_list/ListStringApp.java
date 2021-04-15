package opdracht1_list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ListStringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> reversedList = new ArrayList<>();
        String woord;

        System.out.println("Insert words: ");
        do {
            woord = scanner.nextLine();
            list.add(woord);
        }
        while(!woord.endsWith("."));

        System.out.println("The words are: " + list);
        for(int i = list.size()-1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println("The words reversed are: " + reversedList);
        System.out.println("The total amounts of words are: " + reversedList.size());

        System.out.println();

        for (String string : list) {
            System.out.print(string + " ");
        }
    }
}
