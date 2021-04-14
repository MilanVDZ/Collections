package opdracht2_hashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryApp2 {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Your 6 random numbers: ");

        int randomNumber;

        for (int i = 0; i < 6; i++) {
            randomNumber = randomizer.nextInt(45)+1;
            numbers.add(randomNumber);
        }
        System.out.println(numbers);
    }
}
