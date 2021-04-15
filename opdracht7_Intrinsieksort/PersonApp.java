package opdracht7_Intrinsieksort;

import java.util.HashSet;
import java.util.Set;

public class PersonApp {
    public static void main(String[] args) {
        Set<Person> persoon = new HashSet<>();

        persoon.add(new Person("Milan", "Van der Zypen", Person.Gender.MALE,23,80,180));
        persoon.add(new Person("Mark", "Horemans", Person.Gender.MALE,35,70,185));
        persoon.add(new Person("Maurice", "Shmitz", Person.Gender.MALE,50,90,160));
        persoon.add(new Person("Maurice", "Shmitz", Person.Gender.MALE,50,90,160));

        persoon.forEach(System.out::println);
    }
}
