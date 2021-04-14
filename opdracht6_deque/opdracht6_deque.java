package opdracht6_deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import static java.lang.System.*;
import java.util.List;
import java.util.ArrayList;


public class opdracht6_deque {
    public static void main(String[] args) {
        Deque<Person> personen = new ArrayDeque<>();

        personen.offerFirst(new Person("Dirk", "Chef", Person.Gender.MALE));
        personen.offerFirst(new Person("Mark", "Dupuis", Person.Gender.MALE));
        personen.offerFirst(new Person("Jens", "Gens", Person.Gender.MALE));
        personen.offerLast(new Person("Nona", "Chef", Person.Gender.FEMALE));
        personen.offerLast(new Person("Luna", "Chef", Person.Gender.FEMALE));
        personen.offerLast(new Person("Margaux", "Vandestraeten", Person.Gender.FEMALE));

        int size = personen.size();
        for (int i = 0; i < size / 2; i++) {
            Person husband = personen.pollFirst();
            Person wife = personen.pollLast();
            out.println("Couple : " + Objects.requireNonNull(husband).getFirstName() + " and " +
                    Objects.requireNonNull(wife).getFirstName());

            Person p = personen.pollFirst();
            while (p != null) {
                out.println(p);
                p = personen.pollFirst();
            }
        }
//        List<opdracht6_deque.Person> personlist = new ArrayList<>();
//        personlist.add(0,new opdracht6_deque.Person("Dirk", "Chef", opdracht6_deque.Person.Gender.MALE));
//        personlist.add(1,new opdracht6_deque.Person("Mark", "Dupuis", opdracht6_deque.Person.Gender.MALE));
//        personlist.add(2,new opdracht6_deque.Person("Jens", "Gens", opdracht6_deque.Person.Gender.MALE));
//        personlist.add(3,new opdracht6_deque.Person("Nona", "Chef", opdracht6_deque.Person.Gender.FEMALE));
//        personlist.add(4,new opdracht6_deque.Person("Luna", "Chef", opdracht6_deque.Person.Gender.FEMALE));
//        personlist.add(5,new opdracht6_deque.Person("Margaux", "Vandestraeten", opdracht6_deque.Person.Gender.FEMALE));
//
//        int listSize = personlist.size();
//        for (int i = 0; i < listSize; i++) {
//            out.println("Couple : " +
//                    Objects.requireNonNull(personlist.get(i)).getFirstName() +
//                    " and " +
//                    Objects.requireNonNull(personlist.get(listSize - 1)).getFirstName());
//            if(i == listSize / 2) break;
//        }
    }
}