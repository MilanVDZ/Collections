package opdacht8_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonApp {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("Mike", 80));
        person.add(new Person("Dirk", 75));
        person.add(new Person("David", 100));
        person.add(new Person("Nele", 50));

        person.sort(Comparator.comparing(Person::getName));

        for (int i = 0; i < person.size(); i++) {    // person.forEach(System.out::println);
            System.out.println(person.get(i));
        }

        System.out.println();

        person.sort(Comparator.comparing(Person::getWeight));

        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }
    }
}
