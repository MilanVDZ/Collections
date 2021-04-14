package opdracht2_hashset;

import java.util.HashSet;

public class PersonApp {

    public static void main(String[] args) {
        HashSet<Person> persoon = new HashSet<>();

        persoon.add(new Person("Milan", "VDZ", Person.Gender.MALE,23,80,180));
        persoon.add(new Person("Milan", "VDZ", Person.Gender.MALE,23,80,180));
        persoon.add(new Person("Milan", "VDZ", Person.Gender.MALE,23,80,180));

    }

}
